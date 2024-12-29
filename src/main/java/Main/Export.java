package Main;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Main.DataController.*;
import static Main.SetupFunctions.*;

public class Export extends MainClass {
    int dayStartHour ;
    int dayEndHour;
    private ExcelUtil excelUtil;

    void export(String Vendor, String Technology, String ObjectType, String Resolution, String kPI, boolean Aggregation)  throws Exception  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Wait up to 50 seconds

        String sheetName=Vendor+"_"+ Technology+"_"+Resolution;
        driver.findElement(By.xpath("//app-left-side-menu[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Export')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//app-notification[1]/button[1]/em[1]")).click();
        Thread.sleep(4000);

        String fileName =driver.findElement(By.xpath("(//div[@class=\"p-element report-name body-bold-m\"])[1]")).getText();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//em[@class=\"fa-regular fa-file-arrow-down download-regular-icon\"])[1]")));
        driver.findElement(By.xpath("(//em[@class=\"fa-regular fa-file-arrow-down download-regular-icon\"])[1]")).click();
        Thread.sleep(4000);


        excelUtil = new ExcelUtil(System.getProperty("user.dir") + "\\ExportedReport\\"+fileName);
        //validateExcelData
        Thread.sleep(2000);
       exportData(sheetName,Resolution,kPI,Aggregation,ObjectType);
      exportInfo(Vendor,Technology,ObjectType,Resolution,Aggregation);

    }

    public void exportData(String sheetName,String Resolution ,String KPI, boolean Aggregation,String ObjectType) throws Exception {

        switch (Resolution)
    {
          case "Hourly" -> {

              // Define the range of dates
              LocalDate startDate = LocalDate.of(startYear, monthNumber(startMonth), startDay);
              LocalDate endDate = LocalDate.of(endYear, monthNumber(endMonth), endDay);

              // Define specific times for the start and end
              String startHour = startHH+":"+startMM+" "+startAmPm; // 10 AM on the first day
              String endHour =EndHH+":"+EndMM+" "+EndAmPm;   // 3 PM on the last day
              int j = 1;
              int K=0;
              if(!Aggregation){
              do {

                  for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                      System.out.println("Date: " + date);

                      // Determine the starting hour and ending hour for the current day
                       dayStartHour = (date.equals(startDate)) ? TimeFormat(startHour) : 0;
                       dayEndHour = (date.equals(endDate)) ? TimeFormat(endHour) : 23;

                      // Loop through each hour for the current day
                      for (int hour = dayStartHour; hour <= dayEndHour; hour++) {
                          LocalDateTime dateTime = date.atTime(hour, 0, 0);
                          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                          String formattedDateTime = dateTime.format(formatter);
                          System.out.println(formattedDateTime);
                       try {
                           String actualData = excelUtil.getCellData(sheetName, j, 0); // Row 1, Column 1
                           System.out.println("actualData" + actualData);
                           String expectedData = String.valueOf(date);

                           System.out.println("expectedData" + expectedData);
                           Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");

                           //check the time
                           String actualTime = excelUtil.getCellData(sheetName, j, 1); // Row 1, Column 1
                           System.out.println("actualData" + actualTime);
                           String expectedTime = formattedDateTime;
                           System.out.println("expectedData" + expectedTime);
                           Assert.assertEquals(actualTime, expectedTime, "Cell data mismatch!");
                           // Call the validation method to  check the object type
                           validateObjectType(ObjectType, j, K, sheetName);

                           logger.log(Status.PASS, "Assert" + "(Actual: " + actualData + " " + actualTime + " ,Expected:" + expectedData + " "
                                   + actualTime + ",NE:" + excelUtil.getCellData(sheetName, j, 3) + ")");
                       }
                         catch (NullPointerException  e) {
                             logger.log(Status.FAIL, "Data  not found in the excel in row :" + j );
                         }
                          j++;
                      }
                  }
                  objectNumber--;
                  K++;
              }
              while (objectNumber>0);}

              // for Aggregation
              else {

                      for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                          System.out.println("Date: " + date);

                          // Determine the starting hour and ending hour for the current day
                          dayStartHour = (date.equals(startDate)) ? TimeFormat(startHour) : 0;
                          dayEndHour = (date.equals(endDate)) ? TimeFormat(endHour) : 23;

                          // Loop through each hour for the current day
                          for (int hour = dayStartHour; hour <= dayEndHour; hour++) {
                              LocalDateTime dateTime = date.atTime(hour, 0, 0);
                              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                              String formattedDateTime = dateTime.format(formatter);
                              System.out.println(formattedDateTime);

                              String actualData = excelUtil.getCellData(sheetName, j, 0); // Row 1, Column 1
                              System.out.println("actualData" + actualData);
                              String expectedData = String.valueOf(date);

                              System.out.println("expectedData" + expectedData);
                              Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");

                              //check the time
                              String actualTime = excelUtil.getCellData(sheetName, j, 1); // Row 1, Column 1
                              System.out.println("actualData" + actualTime);
                              String expectedTime = formattedDateTime;
                              System.out.println("expectedData" + expectedTime);
                              Assert.assertEquals(actualTime, expectedTime, "Cell data mismatch!");
                              logger.log(Status.PASS, "Assert" + "(Actual: " + actualData + " " + actualTime + " ,Expected:" + expectedData + " "
                                      + actualTime + ",NE:" +excelUtil.getCellData(sheetName, j, 3)+ ")");

                              j++;
                          }
                      }
              }
          }


            //----------------------------------------------

            case "Daily", "DailyBH" -> {
                String Start= DateFormat(startYear,startMonth,startDay);
                System.out.println(Start);
                String End= DateFormat(endYear,endMonth,endDay);
                System.out.println(End);
                List<LocalDate> datesInRange=RetrieveDatesInRange(Start,End);
                int j=1;
                int K=0;
                if(!Aggregation){
                do {
                    for (LocalDate localDate : datesInRange) {
                        try {
                            String actualData = excelUtil.getCellData(sheetName, j, 0); // Row 1, Column 1
                            System.out.println("actualData" + actualData);
                            String expectedData = String.valueOf(localDate);
                            System.out.println("expectedData" + expectedData);
                            Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");
                            // Call the validation method
                            validateObjectType(ObjectType, j, K, sheetName);
                            logger.log(Status.PASS, "Assert" + "(Actual: " + actualData + " ,Expected:" + expectedData + " ,NE:" + excelUtil.getCellData(sheetName, j, 3) + ")");
                        }
                         catch (NullPointerException  e) {
                            logger.log(Status.FAIL, "Data  not found in the excel in row :" + j );
                        }

                        j++;
                    }
                    K++;
                    objectNumber--;

                }while (objectNumber>0);


                }
                else {
                    for (LocalDate localDate : datesInRange) {
                        String actualData = excelUtil.getCellData(sheetName, j, 0); // Row 1, Column 1
                        System.out.println("actualData" + actualData);
                        String expectedData = String.valueOf(localDate);
                        System.out.println("expectedData" + expectedData);
                        Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");
                        logger.log(Status.PASS, "Assert" + "(Actual: " + actualData + " ,Expected:" + expectedData + " ,NE:" + excelUtil.getCellData(sheetName, j, 3) + ")");
                        j++;
                    }
                }
          }

    }

    //Checking the KPI's
        if (!KPI.equals("All")){
            String actualData = excelUtil.getCellData(sheetName, 0, 4); // Row 1, Column 1
            System.out.println("actualData" + actualData);
            String expectedData =KPI;
            System.out.println("expectedData" + expectedData);
            Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");
            logger.log(Status.PASS, " KPI Assert" + "(Actual: " + actualData + " ,Expected:" + expectedData + ")");

        }
    }

    public void exportInfo(String Vendor, String Technology, String ObjectType, String Resolution ,boolean Aggregation) throws Exception {
        List<String> data = new ArrayList<>();
        String Start= DateFormat(startYear,startMonth,startDay);
        Start= DateFormatChange (Start);
        System.out.println(Start);
        String End= DateFormat(endYear,endMonth,endDay);
       End= DateFormatChange (End);
        System.out.println(End);
        if (Resolution.equals("Hourly")){
            data.add(Start.split(" ")[0]+" "+dayStartHour+":00");}
        else {
        data.add(Start);}
        if (Resolution.equals("Hourly")){
            data.add(End.split(" ")[0]+" "+dayEndHour+":00");}
        else {
        data.add(End);}
        data.add(Resolution);
        data.add("FALSE"); // Last hour in result
        data.add(Vendor);
        data.add(Technology);
        data.add(Dataview);
        data.add(String.valueOf(Aggregation).toUpperCase());
        if(ObjectType.equals("Region")){ data.add(ObjectType+" "+"Level : "+String.join(", ",regions));}
        else if(ObjectType.equals("RNC")){  data.add("Controller or "+ObjectType+" "+"Level");}
        else if(ObjectType.equals("Cluster")){
            for(int i=0;i<Clusters.size();i++) {
                ClustersNum.add(Clusters.get(i).replaceAll("\\D+", ""));
            }
            data.add(ObjectType+" "+"Level : "+String.join(", ",ClustersNum));}
        else{
        data.add(ObjectType+" "+"Level");}
        System.out.println(data);

        for (int i=0;i<data.size();i++) {
            String actualData = excelUtil.getCellData("info", i, 1); // Row 1, Column 1
            String expectedData = String.valueOf(data.get(i));
            System.out.println("expectedData"+ expectedData);
            Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");
            logger.log(Status.PASS, "Assert" + "(Actual: " + actualData + " ,Expected:" + expectedData + ")");
        }

    }



    public String  DateFormat(int year,String month,int day) {

        int monthNumber = switch (month) {
            case "Jan" -> 1;
            case "Feb" -> 2;
            case "Mar" -> 3;
            case "Apr" -> 4;
            case "May" -> 5;
            case "Jun" -> 6;
            case "Jul" -> 7;
            case "Aug" -> 8;
            case "Sep" -> 9;
            case "Oct" -> 10;
            case "Nov" -> 11;
            case "Dec" -> 12;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };

        // Create LocalDate
        LocalDate date = LocalDate.of(year, monthNumber, day);

        // Format date as YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);

        // Print result
        System.out.println(formattedDate); // Output: 2024-02-01
        return formattedDate;
    }

    public List RetrieveDatesInRange(String startDateStr,String endDateStr ) {

        // Convert strings to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        // Retrieve all dates in the range
        List<LocalDate> datesInRange = getDatesBetween(startDate, endDate);

        // Print the dates
     /*   System.out.println("Dates between " + startDate + " and " + endDate + ":");
        for (LocalDate date : datesInRange) {
            System.out.println(date.format(formatter));
        }*/
      return datesInRange;
    }

    public static List<LocalDate> getDatesBetween(LocalDate startDate, LocalDate endDate) {
        List<LocalDate> dates = new ArrayList<>();
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            dates.add(currentDate);
            currentDate = currentDate.plusDays(1);
        }

        return dates;
    }


    public String DateFormatChange(String inputDate) {



            // Parse input date to LocalDate
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Convert LocalDate to LocalDateTime (adding time as 0:00)
            LocalDateTime dateTime = date.atStartOfDay();

            // Format date to "MM/dd/yyyy HH:mm"
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm");
            String formattedDate = dateTime.format(outputFormatter);

            // Print the formatted date
            System.out.println(formattedDate); // Output: 02/07/2024 0:00

        return formattedDate;
        }


    public int TimeFormat(String time12Hour) throws ParseException {
        if (time12Hour == null || time12Hour.trim().isEmpty()) {
            throw new IllegalArgumentException("Time string cannot be null or empty");
        }

        try {
            SimpleDateFormat sdf12Hour = new SimpleDateFormat("hh:mm a");
            SimpleDateFormat sdf24Hour = new SimpleDateFormat("HH");

            // Parse the time in 12-hour format
            Date date = sdf12Hour.parse(time12Hour);

            // Get only the hour in 24-hour format
            String hour24String = sdf24Hour.format(date);
            System.out.println(hour24String);
            // Convert to integer and return
            return Integer.parseInt(hour24String);

        } catch (ParseException e) {
            throw new ParseException("Invalid time format. Please use format like '08:30 AM' or '02:45 PM'", e.getErrorOffset());
        } catch (NumberFormatException e) {
            throw new ParseException("Failed to parse hour value", 0);
        }
    }



    public int  monthNumber(String month) {

        int monthNumber = switch (month) {
            case "Jan" -> 1;
            case "Feb" -> 2;
            case "Mar" -> 3;
            case "Apr" -> 4;
            case "May" -> 5;
            case "Jun" -> 6;
            case "Jul" -> 7;
            case "Aug" -> 8;
            case "Sep" -> 9;
            case "Oct" -> 10;
            case "Nov" -> 11;
            case "Dec" -> 12;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        return monthNumber;
    }

    private void validateObjectType(String objectType, int rowIndex, int Index, String sheetName)  {
        String actual;
        String expected;
        switch (objectType) {
            case "Region" -> {
                    expected = regions.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+"data mismatch!");
            }
            case "Cluster" -> {
                expected = Clusters.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+" data mismatch!");
            }
            case "PLMNXDD" -> {
                expected = PlmnXDD.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+" data mismatch!");
            }
            case "RNC" -> {
                expected = RNC.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+" data mismatch!");
            }
            case "Region Carrier" -> {
                expected = RegionCarrier.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+" data mismatch!");
            }
            case "PLMN Carrier" -> {
                expected = PLMNCarrier.get(Index);
                actual = excelUtil.getCellData(sheetName, rowIndex, 3);
                Assert.assertEquals(actual, expected, objectType+" "+" data mismatch!");
            }
            default -> {
            }
        }
    }

}

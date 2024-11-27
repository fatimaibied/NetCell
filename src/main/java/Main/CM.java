package Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Main.MainClass.driver;
import static Main.SetupFunctions.*;
import static Main.SetupFunctions.readLocator;

public class CM {
    WebElement element;

    List<String> relatedElements;
    List<String> relatedElementsXDD;
    List<String> relatedElementsRegionArrow;
    List<String> relatedElementsRegionClose;
    List<String> relatedElementsGovernorate;
    List<String> relatedElementsSites;
    List<String> relatedElementsCells;
    List<String> relatedElementsCellOne;
    List<String> relatedElementsBSC;
    List<String> relatedElementsCluster;
    List<String> relatedElementsSector;
    Functions support = new Functions();
    boolean bt;
    public void Parameter(String Technology, String ObjectType, String ResolutionTemp) throws Exception {

        support.login("CM");
        driver.findElement(By.xpath(readLocator(CMSelectors,"Parameter"))).click();
        Thread.sleep(1000);
        selectObjectType( ObjectType ,Technology );

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
        Thread.sleep(20000);
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertEquals(bt, false);
        }
        catch (Exception e) {
            Assert.assertEquals(bt, false);
        }

    }
    //------------------------------------------------------------------------------------------------------
    public void view(String Technology, String ObjectType, String TargetType,String ResolutionTemp) throws Exception {

        support.login("CM");
        driver.findElement(By.xpath(readLocator(CMSelectors,"View"))).click();
        Thread.sleep(1000);
        selectObjectType( ObjectType ,Technology );
        Thread.sleep(1000);
        element = driver.findElement(By.xpath("//label[contains(text(),'Monitoring Target Type')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"))).click();

        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"+TargetType))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetCell"))).click();
        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
        Thread.sleep(20000);
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertEquals(bt, false);
        }
        catch (Exception e) {
            Assert.assertEquals(bt, false);
        }

    }
    //-------------------------------------------------------------------------------------------------------------------
     public void compare(String Technology, String ObjectType, String MonitoringTargetType) throws Exception {

    support.login("CM");
    driver.findElement(By.xpath(readLocator(CMSelectors,"Compare"))).click();
    Thread.sleep(1000);
    selectObjectType( ObjectType ,Technology );

    //Apply and Verify
    driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
    Thread.sleep(20000);
    try {

        bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

        Assert.assertEquals(bt, false);
    }
    catch (Exception e) {
        Assert.assertEquals(bt, false);
    }

}

    //--------------------------------------------------------------------------------------------------------
    void selectObjectType(String ObjectType , String Technology) throws Exception {

        driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectSelection"))).click();
        relatedElements = readTags("Regions", SONSelectors);
        relatedElementsXDD = readTags("XDD", SONSelectors);
        relatedElementsRegionArrow = readTags("RegionArrow", SONSelectors);
        relatedElementsRegionClose = readTags("RegionClose", SONSelectors);
        relatedElementsGovernorate=readTags("Governorates", SONSelectors);
        relatedElementsSites=readTags("Sites", SONSelectors);
        relatedElementsCells=readTags("Cells", SONSelectors);
        relatedElementsCellOne= readTags("CellOne", SONSelectors);
        relatedElementsBSC= readTags("BSCS", SONSelectors);
        relatedElementsCluster= readTags("Clusters", SONSelectors);
        relatedElementsSector= readTags("Sectors", SONSelectors);


        switch (ObjectType) {
            case "PLMN":
                //Object Selection (PLMN)
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMN"))).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();

                break;

            //-------------------------------------------------------------
            case "Region":
                //Object Selection (Region)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Region"))).click();
                Thread.sleep(1000);
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


                for (int i = 0; i < relatedElements.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElements.get(i)))).click();

                }

                break;
            //-------------------------------------------------------------
            case "Site" :
                //Object Selection (Site)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Site"))).click();
                Thread.sleep(1000);
                //element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
               // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSites.get(i)))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                break;
            //-------------------------------------------------------------
            case "Cell":

                //Object Selection (Cell)


                driver.findElement(By.xpath(readLocator(SONSelectors,"Cell"))).click();

                Thread.sleep(1000);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCells.get(i)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCellOne.get(i)))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                break;

            //-------------------------------------------------------------
            case "Region Band" :
                //Object Selection (Region Band)


                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors,"FDDArrow"))).click();
                for (int i = 0; i < relatedElements.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElements.get(i)))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors,"FDDCloseArrow")));

                //-------------------------------------------------------------------------------------------------------
                driver.findElement(By.xpath(readLocator(SONSelectors,"TDDArrow")));
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsEastJordan"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsOthers"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsSouthAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"TDDCloseArrow")));

                break;
            //-------------------------------------------------------------
            case "Region XDD" :
                //Object Selection (Region XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    for (int j = 0; j < relatedElementsXDD.size(); j++) {
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsXDD.get(j)))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();

                }

                break;
            //-------------------------------------------------------------
       /*  case "Cluster Band" :
                //Object Selection (Cluster Band)

                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Cluster Bands/TopX Cluster Band'))
                WebUI.delay(1)
                WebUI.scrollToElement(findTestObject("Object Repository/PM/Huawei-vendor/Object Border"), 0)

                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Arrow'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Amman'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region West Amman'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Jordan'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region North Jordan'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX FDD Close Arrow'))

                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Arrow'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region East Jordan'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region Others'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Regions/TopX Region South Amman'))
                WebUI.click(findTestObject('Object Repository/PM/Huawei-vendor/Object-Type/TopX Object Types/TopX Region Bands/TopX TDD Close Arrow'))

                break;*/
            //-------------------------------------------------------------
            case "Cluster" :
                //Object Selection (Cluster)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Cluster"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCluster.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }


                break;
            //-------------------------------------------------
            case "PLMN XDD" :
                //Object Selection (PLMN XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();

                break;

            //-------------------------------------------------

            case "Sector" :
                //Object Selection (Sector)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Sector"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSector.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
                break;

            //-------------------------------------------------

            case "Governorate" :
                //Object Selection (Governorate)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Governorate"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsGovernorate.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsGovernorate.get(i)))).click();

                }

                break;

            //-------------------------------------------------

            case "Governorate XDD" :
                //Object Selection (Governorate XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors,"GovernorateXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDArrow"))).click();
                for (int i = 0; i < relatedElementsGovernorate.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsGovernorate.get(i)))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDClose"))).click();

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDArrow"))).click();
                for (int i = 0; i < relatedElementsGovernorate.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsGovernorate.get(i)))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDClose"))).click();

                break;

            //-------------------------------------------------

            case "Governorate Band" :
                //Object Selection (Governorate Band)

                driver.findElement(By.xpath(readLocator(SONSelectors,"GovernorateBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();

                break;
            //----------------------------------------------------
            case "BSC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"BSC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


                for (int i = 0; i < relatedElementsBSC.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsBSC.get(i)))).click();

                }
                break;

            case "RNC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"RNC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


                for (int i = 1; i < 5; i++) {

                    driver.findElement(By.xpath("//p-treenode[1]/li[1]/ul[1]/p-treenode["+i+"]/li[1]")).click();
                }
                break;

            case "Region Carrier" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsEastAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsWestAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsSouthJordan"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsNorthJordan"))).click();

                break;

            case "PLMN Carrier" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"PLMNCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 1; i < 3; i++) {

                    driver.findElement(By.xpath("//span[contains(text(),'F"+i+"')]")).click();
                }

                break;

        }
    }
    void selectResolution(WebDriver driver, String ResolutionTemp, String SonType) throws InterruptedException {
        String scroll;

        if(SonType!="4g congested cells" &SonType!="4G Balance" ){
            scroll=readLocator(SONSelectors, "ExcludeOptions");
        }
        else if (SonType=="4G Balance" ){
            scroll=readLocator(SONSelectors, "Carrier");
        }
        else {
            scroll=readLocator(SONSelectors, "DailyBH");
        }

        Thread.sleep(1000);
        if (ResolutionTemp!="") {
            String startDate;
            WebElement element = driver.findElement(By.xpath(scroll));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            switch (ResolutionTemp)
            {

                case "Hourly" :
                    startDate=date("Last week");
                   /* WebElement element = driver.findElement(By.xpath(scroll));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
*/
                    //WebUI.scrollToElement(findTestObject(scroll), 0);
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

                    break;
                //----------------------------------------------

                case "Daily" :
                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    if (SonType!="Azimuth Discrepancy" ) {
                        driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();


                    startDate=date("Last week");
                    System.out.println(startDate);
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                    break;
                //---------------------------------------------

                case "Weekly" :
                    // WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Weekly"))).click();


                    startDate=date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

                    break;
                //------------------------------------------

                case "Monthly" :
                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Monthly"))).click();


                    startDate=date("Last Month");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

                    break;
                //---------------------------------------

                case "DailyBH" :

                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    if (SonType!="4g congested cells" ) {

                        driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                        driver.findElement(By.xpath(readLocator(SONSelectors, "DailyBH"))).click();
                    }

                    startDate=date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

                    break;
                //------------------------------------------

                case "WeeklyBH" :

                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "WeeklyBH"))).click();

                    startDate=date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                    break;
                //------------------------------------------
                case "MonthlyBH" :
                    // WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "MonthlyBH"))).click();


                    startDate=date("Last Month");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                    break;
                case "Raw" :
                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Raw"))).click();


                    startDate=date("Yesterday");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                    break;

            }

            driver.findElement(By.xpath(readLocator(SONSelectors, "Month"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "MonthFeb"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Feb-1"))).click();

        }
    }

    //------------------------------------------------------------------------------------------
    String date(String day ) {

        String date="";
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        if (day=="Last week") {

            //date = dateFormat.format(today)
            calendar.add(Calendar.DAY_OF_YEAR, -7);
            Date LastWeek = calendar.getTime();
            date = dateFormat.format(LastWeek);
            System.out.println(date);

        }
        else if (day=="Yesterday") {
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            Date Yesterday = calendar.getTime();
            date = dateFormat.format(Yesterday);
        }

        else if (day=="Last Month") {calendar.add(Calendar.DAY_OF_YEAR, -30);
            Date LastMonth = calendar.getTime();
            date = dateFormat.format(LastMonth);
        }

        return date;
    }


}



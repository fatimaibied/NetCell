package Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
    List<String> relatedElementsRegions;
    List<String> relatedElementsSector;
    List<String> relatedElementsDestinationSite;
    List<String> relatedElementsDestinationCellSite;
    List <String>relatedElementsDestinationCell;
    Functions support = new Functions();
    boolean bt;
    public void Parameter(String Technology, String ObjectType, String PredefinedTime) throws Exception {
        Thread.sleep(1000);

        support.login("CM");

        Thread.sleep(500);
        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();
        driver.findElement(By.xpath(readLocator(CMSelectors,"Parameter"))).click();
        Thread.sleep(1000);
        selectObjectType( ObjectType ,Technology );
        PredefinedTime(PredefinedTime);

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
        Thread.sleep(40000);
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertEquals(bt, false);
        }
        catch (Exception e) {
            Assert.assertEquals(bt, false);
        }

    }
    //------------------------------------------------------------------------------------------------------
    public void view(String Technology, String ObjectType, String TargetType) throws Exception {

        support.login("CM");
        Thread.sleep(500);
        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();
        driver.findElement(By.xpath(readLocator(CMSelectors,"View"))).click();
        Thread.sleep(1000);
        selectObjectType( ObjectType ,Technology );
        Thread.sleep(1000);
        element = driver.findElement(By.xpath("//label[contains(text(),'Monitoring Target Type')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"))).click();

        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"+TargetType))).click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath(readLocator(CMSelectors, "TargetCell")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
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
         Thread.sleep(500);
         driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
         driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();
    driver.findElement(By.xpath(readLocator(CMSelectors,"Compare"))).click();
    Thread.sleep(1000);
    selectCompareObject( ObjectType );

         Thread.sleep(2000);




         if (MonitoringTargetType!=""){

        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"))).click();
        driver.findElement(By.xpath(readLocator(CMSelectors, "TargetType"+MonitoringTargetType))).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//label[contains(text(),'Monitoring Target Type')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

             driver.findElement(By.xpath(readLocator(CMSelectors, "TargetCell"))).click();
    }
        else {
        driver.findElement(By.xpath(readLocator(CMSelectors,"All"))).click();}
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
                WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Object type')]"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                //--------Remove others from the list for 2G
                int Regions =relatedElementsRegionArrow.size();;
                if (Technology!="4G"){
                    Regions=relatedElementsRegionArrow.size()-1;
                }

                //-----------------
                for (int i = 0; i < Regions; i++) {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSites.get(i)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                break;
            //-------------------------------------------------------------
            case "Cell":

                //Object Selection (Cell)


                driver.findElement(By.xpath(readLocator(SONSelectors,"Cell"))).click();

                Thread.sleep(1000);
                element = driver.findElement(By.xpath("//div[contains(text(),'Object type')]"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCells.get(i)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCellOne.get(i)))).click();
                    Thread.sleep(2000);
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

                        element =driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsXDD.get(j))));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                        Thread.sleep(1000);
                        element.click();
                        Thread.sleep(1000);
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                break;

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

    //-----------------------------------------------------------------------------------------------------------
    void selectCompareObject(String ObjectType ) throws Exception {

        driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectSelection"))).click();
        relatedElements = readTags("Regions", SONSelectors);
        relatedElementsRegionArrow = readTags("RegionArrow", SONSelectors);
        relatedElementsRegions = readTags("RegionArrow", CMSelectors);
        relatedElementsRegionClose = readTags("RegionClose", SONSelectors);

        relatedElementsSites=readTags("Sites", CMSelectors);
        relatedElementsCells=readTags("Cells", SONSelectors);
        relatedElementsCellOne= readTags("CellOne", CMSelectors);

        relatedElementsDestinationSite=readTags("SitesDestination", CMSelectors);
        relatedElementsDestinationCellSite=readTags("SiteDestination", CMSelectors);
        relatedElementsDestinationCell=readTags("CellDestination", CMSelectors);
        Random random = new Random();
        int randomNumber = random.nextInt(5) + 1;

        int secondNumber;
        do {
            secondNumber = random.nextInt(5) + 1; // Random number between 1 and 7
        } while (secondNumber == randomNumber);

        switch (ObjectType) {

            //-------------------------------------------------------------
            case "Site" :
                //Object Selection (Site)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Site"))).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath(readLocator(CMSelectors,"CompareNEs"))).click();

                Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(randomNumber)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsSites.get(randomNumber)))).click();
                    Thread.sleep(3000);

                driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsRegions.get(secondNumber)))).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsDestinationSite.get(secondNumber)))).click();


                break;
            //-------------------------------------------------------------
            case "Cell":

                //Object Selection (Cell)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Cell"))).click();

                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(CMSelectors,"CompareNEs"))).click();



                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(randomNumber)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCells.get(randomNumber)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsCellOne.get(randomNumber)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(randomNumber)))).click();
                    driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsRegions.get(secondNumber)))).click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsDestinationCellSite.get(secondNumber)))).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath(readLocator(CMSelectors, relatedElementsDestinationCell.get(secondNumber)))).click();
                break;


            case "RNC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"RNC"))).click();

                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(CMSelectors,"CompareNEs"))).click();

                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[2]/div[1]/app-general-tree[1]/p-tree[1]/div[1]/div[1]/ul[1]/p-treenode[1]/li[1]/ul[1]/p-treenode["+randomNumber+"]/li[1]/div[1]/span[1]/span[1]/div[1]/input[1]")).click();
                driver.findElement(By.xpath("//div[2]/div[2]/app-general-tree[1]/p-tree[1]/div[1]/div[1]/ul[1]/p-treenode[1]/li[1]/ul[1]/p-treenode["+secondNumber+"]/li[1]/div[1]/span[1]/span[1]/div[1]/input[1]")).click();


                break;

            case "BSC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"BSC"))).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(CMSelectors,"CompareNEs"))).click();

                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[2]/div[1]/app-general-tree[1]/p-tree[1]/div[1]/div[1]/ul[1]/p-treenode[1]/li[1]/ul[1]/p-treenode["+randomNumber+"]/li[1]/div[1]/span[1]/span[1]/div[1]/input[1]")).click();
                driver.findElement(By.xpath("//div[2]/div[2]/app-general-tree[1]/p-tree[1]/div[1]/div[1]/ul[1]/p-treenode[1]/li[1]/ul[1]/p-treenode["+secondNumber+"]/li[1]/div[1]/span[1]/span[1]/div[1]/input[1]")).click();


                break;
        }

        driver.findElement(By.xpath(readLocator(CMSelectors,"Save"))).click();
    }

//----------------------------------------------------------------


    void PredefinedTime (String PredefinedTime)  {
        WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Data and time')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(readLocator(CMSelectors, "LastWeek"))).click();
        driver.findElement(By.xpath(readLocator(CMSelectors, PredefinedTime))).click();
    }
    //-----------------------------------------------------------------------------------------
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



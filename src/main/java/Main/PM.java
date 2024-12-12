package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.plaf.synth.Region;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static Main.MainClass.driver;
import static Main.SetupFunctions.*;
import static Main.SetupFunctions.SONSelectors;

public class PM {
    WebElement element;
    boolean bt;
    List<String> relatedElements;
    List<String> relatedElementsXDD;
    List<String> relatedElementsRegionArrow;
    List<String> relatedElementsRegionClose;
    List<String> relatedElementsRegionCClose;
    List<String> relatedElementsGovernorate;
    List<String> relatedElementsSites;
    List<String> relatedElementsCells;
    List<String> relatedElementsCellOne;
    List<String> relatedElementsBSC;
    List<String> relatedElementsCluster;
    List<String> relatedElementsClusterOne;
    List<String> relatedElementsSector;
   int objectNumber;
    //-------------------------Stats-----------------------------------
    public void Stats (String Vendor, String Technology , String ObjectType , boolean Aggregation , String Resolution) throws Exception {
        Functions support = new Functions();
        //Click on the PM
        support.login("PM");
        Thread.sleep(1000);

        //Vendor Selection
        if (Vendor=="Nokia") {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Nokia"))).click();
        }
        else if (Vendor=="Mix"){
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Mix"))).click();
        }
        Thread.sleep(500);

        //Technology Selection
        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();
        Thread.sleep(1000);

        //Object type Selection
        selectObjectType( ObjectType ,Technology);

        if (Aggregation == true)
        {
            driver.findElement(By.xpath(readLocator(PMSelectors, "AggregationBtn"))).click();
        }
        //Set Resolution
        selectResolution(driver,Resolution);

        //KPI Selection
        driver.findElement(By.xpath(readLocator(PMSelectors, "KPI"))).click();

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();

        Thread.sleep(2000);
        if (objectNumber>6 & Aggregation != true) {

                driver.findElement(By.xpath(readLocator(PMSelectors, "OkBtn"))).click();

        }
        Thread.sleep(20000);

        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertEquals(bt, false);
        }
        catch (Exception e) {
            Assert.assertEquals(bt, false);
        }

    }

    //-------------------------TopX-----------------------------------
    public void TopX (String Vendor, String Technology , String ObjectType , String Resolution, String AggregationLevel, Boolean lowX) throws Exception {
        Functions support = new Functions();
        //Click on the PM
        support.login("PM");
        Thread.sleep(500);

        //Vendor Selection
        if (Vendor=="Nokia") {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Nokia"))).click();
        }


        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();

        driver.findElement(By.xpath(readLocator(PMSelectors, "TopX"))).click();
        Thread.sleep(1000);
        selectObjectType( ObjectType ,Technology );

        //Set Resolution
        selectResolutionTopX(driver,Resolution);

        //-----------------------------

        if (lowX==true)
        {
            Thread.sleep(1000);
            driver.findElement(By.xpath(readLocator(PMSelectors, "lowXCheckbox"))).click();

        }

        //KPI Selection
        driver.findElement(By.xpath(readLocator(PMSelectors, "KPI"))).click();

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
/*

        Thread.sleep(20000);
        if ((ObjectType!="PLMN" )&& (ObjectType!="PLMN XDD" )&& (ObjectType!="Governorate")) {

            driver.findElement(By.xpath(readLocator(PMSelectors, "OkBtn"))).click();

        }
*/
        Thread.sleep(20000);
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertEquals(bt, false);
        }
        catch (Exception e) {
            Assert.assertEquals(bt, false);
        }


    }

    void selectObjectType(String ObjectType , String Technology ) throws Exception {

        driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectSelection"))).click();
        relatedElements = readTags("Regions", SONSelectors);
        relatedElementsXDD = readTags("XDD", SONSelectors);
        relatedElementsRegionArrow = readTags("RegionArrow", SONSelectors);
        relatedElementsRegionClose = readTags("RegionClose", PMSelectors);
        //For 4G clusters
        relatedElementsRegionCClose = readTags("RegionCClose", PMSelectors);
        relatedElementsGovernorate=readTags("Governorates", SONSelectors);
        relatedElementsSites=readTags("Sites", SONSelectors);
        relatedElementsCells=readTags("Cells", SONSelectors);
        relatedElementsCellOne= readTags("CellOne", SONSelectors);
        relatedElementsBSC= readTags("BSCS", SONSelectors);
        relatedElementsCluster= readTags("Clusters", PMSelectors);
        relatedElementsClusterOne= readTags("ClusterO", PMSelectors);

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
                objectNumber=relatedElements.size();

                break;
            //-------------------------------------------------------------
            case "Site" :
                //Object Selection (Site)
                int  Regions = relatedElementsRegionArrow.size();

                driver.findElement(By.xpath(readLocator(SONSelectors,"Site"))).click();
                Thread.sleep(1000);
                if (Technology!="4G"){
                   Regions=relatedElementsRegionArrow.size()-1;
                }

                for (int i = 0; i < Regions; i++) {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(2000);


                    element =  driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSites.get(i))));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();
                    Thread.sleep(2000);

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                objectNumber=Regions;
                System.out.println(objectNumber);
                break;
            //-------------------------------------------------------------
            case "Cell":

                //Object Selection (Cell)

                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(PMSelectors,"Cell"))).click();
                if (Technology !="4G") {
                    element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                }
                Thread.sleep(3000);

                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(4000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCells.get(i)))).click();
                    Thread.sleep(2000);
                    element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCellOne.get(i))));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
                objectNumber= relatedElementsRegionArrow.size();
                break;

            //-------------------------------------------------------------
            case "Region Band" :
                //Object Selection (Region Band)


                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionBand"))).click();
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
                objectNumber= relatedElementsRegionArrow.size();


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

                objectNumber= relatedElementsRegionArrow.size();
                break;
            //-------------------------------------------------------------
         case "Cluster Band" :
                //Object Selection (Cluster Band)
             driver.findElement(By.xpath(readLocator(SONSelectors,"ClusterBand"))).click();
             element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
             ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
             Thread.sleep(2000);

             if (Technology!="4G") {
                 driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                 Thread.sleep(2000);
                 for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                     Thread.sleep(1000);
                     driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                     driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsCluster.get(i)))).click();
                     driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionClose.get(i)))).click();
                 }
             }
               else {
             driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
             Thread.sleep(2000);

             for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                 Thread.sleep(1000);
                 driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                 driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsClusterOne.get(i)))).click();

                 driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionCClose.get(i)))).click();
             }

         }
             objectNumber=relatedElementsRegionArrow.size();
             break;
            //-------------------------------------------------------------
            case "Cluster" :
                //Object Selection (Cluster)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Cluster"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                //driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                Thread.sleep(2000);
                if (Technology!="4G") {
                    for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                        Thread.sleep(1000);
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsCluster.get(i)))).click();

                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionClose.get(i)))).click();
                    }
                }
                // for 4G
                else {
                    driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                    Thread.sleep(2000);

                        for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                            Thread.sleep(1000);
                            driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                            driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsClusterOne.get(i)))).click();

                            driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionCClose.get(i)))).click();
                        }

                }
                objectNumber=relatedElementsRegionArrow.size();
                break;
            //-------------------------------------------------
            case "PLMN XDD" :
                //Object Selection (PLMN XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNXDD"))).click();
                 if (Technology != "4G") {
                     element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                 }

                Thread.sleep(2000);

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();

                break;

            //-------------------------------------------------

            case "Sector" :
                //Object Selection (Sector)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Sector"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Regions = relatedElementsRegionArrow.size();
                if (Technology=="3G"){
                    Regions=relatedElementsRegionArrow.size()-1;
                }
                for (int i = 0; i < Regions; i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(1000);

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSector.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }

                objectNumber=Regions;
                break;

            //-------------------------------------------------

            case "Governorate" :
                //Object Selection (Governorate)

                driver.findElement(By.xpath(readLocator(SONSelectors,"Governorate"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                Thread.sleep(1000);
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
                Thread.sleep(2000);

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

                objectNumber=7;
                break;

            //-------------------------------------------------

            case "Governorate Band" :
                //Object Selection (Governorate Band)

                driver.findElement(By.xpath(readLocator(SONSelectors,"GovernorateBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
                objectNumber=7;

                break;
            //----------------------------------------------------
            case "BSC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"BSC"))).click();

                Thread.sleep(1000);

                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);

                for (int i = 0; i < relatedElementsBSC.size(); i++) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsBSC.get(i)))).click();
                    Thread.sleep(1000);


                }
              objectNumber= relatedElementsBSC.size();
                break;

            case "RNC" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"RNC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);

                for (int i = 1; i < 5; i++) {

                    driver.findElement(By.xpath("//p-treenode[1]/li[1]/ul[1]/p-treenode["+i+"]/li[1]")).click();
                }
                break;

            case "Region Carrier" :
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsEastAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsWestAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsSouthJordan"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors,"RegionsNorthJordan"))).click();
                objectNumber=7;
                break;

            case "PLMN Carrier" :
                driver.findElement(By.xpath(readLocator(SONSelectors,"PLMNCarrier"))).click();
                Thread.sleep(2000);
                element = driver.findElement(By.xpath(readLocator(SONSelectors,"ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);
                for (int i = 1; i < 3; i++) {

                    driver.findElement(By.xpath("//span[contains(text(),'F"+i+"')]")).click();
                }

                break;

        }
    }

    void selectResolution(WebDriver driver, String ResolutionTemp) throws InterruptedException {


        Thread.sleep(1000);
        String startDate;

            String scroll;
            scroll = readLocator(SONSelectors, "ExcludeOptions");
            WebElement element = driver.findElement(By.xpath(scroll));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        startDate=date("Last week");
        WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Data and time')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        switch (ResolutionTemp)
        {

            case "Hourly" :

                driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

                break;
            //----------------------------------------------

            case "Daily" :

                driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
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
                WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Data and time')]"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);

                driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "DailyBH"))).click();

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
    void selectResolutionTopX(WebDriver driver, String ResolutionTemp) throws InterruptedException {


        Thread.sleep(1000);
            String startDate;

             String scroll;
                scroll = readLocator(PMSelectors, "LowX");
                WebElement element = driver.findElement(By.xpath(scroll));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            switch (ResolutionTemp)
            {

                case "Hourly" :

                    driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();

                    break;
                //----------------------------------------------
                case "Daily" :

                    break;
                //---------------------------------------------

                case "Weekly" :
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Weekly"))).click();

                    break;
                //------------------------------------------

                case "Monthly" :
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Monthly"))).click();
                    break;

                //---------------------------------------

                case "DailyBH" :
                    driver.findElement(By.xpath(readLocator(SONSelectors,"Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors,"DailyBH"))).click();


                    break;
                //------------------------------------------

                case "WeeklyBH" :
                    driver.findElement(By.xpath(readLocator(SONSelectors,"Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors,"WeeklyBH"))).click();
                    break;
                //------------------------------------------
                case "MonthlyBH" :
                    driver.findElement(By.xpath(readLocator(SONSelectors,"Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors,"MonthlyBH"))).click();

                    break;
                case "Raw" :

                    driver.findElement(By.xpath(readLocator(SONSelectors,"Daily"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors,"Raw"))).click();

                    break;
            }
                driver.findElement(By.xpath(readLocator(PMSelectors,"BeforDate"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"ChooseMonth"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"Feb"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"DayOne"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"OK"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"AfterDate"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"ChooseMonth"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"Feb"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"DaySeven"))).click();
                driver.findElement(By.xpath(readLocator(PMSelectors,"OK"))).click();

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

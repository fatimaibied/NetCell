package Main;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static Main.DataController.*;
import static Main.DataController.endDay;
import static Main.MainClass.driver;
import static Main.SetupFunctions.*;
import static Main.SetupFunctions.readLocator;

public class SON {

    public String CM="";
    public String CarrierType = "";
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
    List<String> relatedElementsRegionCClose;
    List<String> relatedElementsClusterOne;

    WebElement element;
    public String NeighborType = "";
    Functions support = new Functions();
    boolean bt;

    public void son(String Vendor, String Technology, String ObjectType, String SonType, String Resolution, String KPI) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Wait up to 50 seconds

        support.login("SON");
        Thread.sleep(500);
        if (Objects.equals(Vendor, "Nokia")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Nokia"))).click();
        }

        Thread.sleep(500);
        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();

        //---Select the Object Type
        selectObjectType(ObjectType, Technology);

        //-----Select SonType
        Thread.sleep(1000);
        element = driver.findElement(By.xpath(readLocator(SONSelectors, "SonType")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(By.xpath(readLocator(SONSelectors, "SonType"))).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + SonType + "')]")).click();

        //Set Resolution
        selectResolution(driver, Resolution, SonType);

        if (!KPI.equals("")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, KPI))).click();
        }
        // CM data for 4G

        if (CM.equals("Include")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "CM"))).click();
        }

        //CarrierType for 4G
        if (!CarrierType.equals("")) {
            driver.findElement(By.xpath("//button[contains(text(),'" + CarrierType + "')]")).click();
        }

        if (!NeighborType.equals("")) {
            driver.findElement(By.xpath("//button[contains(text(),'" + NeighborType + "')]")).click();
        }

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(readLocator(SONSelectors, "HomeLogo"))));
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertFalse(bt);
        } catch (Exception e) {
            Assert.assertFalse(bt);
        }

        try {
            Thread.sleep(2000);
            boolean noData = driver.findElement(By.xpath("//div[contains(text(),'No data found')]")).isDisplayed();
            Assert.assertTrue(noData);

            System.out.println("No Data");
            }
         catch (Exception e) {

            System.out.println("Data Found");
        }
    }

    void selectObjectType(String ObjectType, String Technology) throws Exception {

        driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectSelection"))).click();
        relatedElements = readTags("Regions", SONSelectors);
        relatedElementsXDD = readTags("XDD", SONSelectors);
        relatedElementsRegionArrow = readTags("RegionArrow", SONSelectors);
        relatedElementsRegionClose = readTags("RegionClose", SONSelectors);
        relatedElementsGovernorate = readTags("Governorates", SONSelectors);
        relatedElementsSites = readTags("Sites", SONSelectors);
        relatedElementsCells = readTags("Cells", SONSelectors);
        relatedElementsCellOne = readTags("CellOne", SONSelectors);
        relatedElementsBSC = readTags("BSCS", SONSelectors);
        relatedElementsCluster = readTags("Clusters", SONSelectors);
        relatedElementsSector = readTags("Sectors", SONSelectors);
        relatedElementsRegionCClose = readTags("RegionCClose", PMSelectors);
        relatedElementsClusterOne = readTags("ClusterO", PMSelectors);

        switch (ObjectType) {
            case "PLMN" -> {
                //Object Selection (PLMN)
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMN"))).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
            }

            //-------------------------------------------------------------
            case "Region" -> {
                //Object Selection (Region)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Region"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (String relatedElement : relatedElements) {
                    Thread.sleep(1000);

                    element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElement)));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();


                }
            }
            //-------------------------------------------------------------
            case "Site" -> {
                //Object Selection (Site)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Site"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSites.get(i)))).click();
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
            }
            //-------------------------------------------------------------
            case "Cell" -> {

                //Object Selection (Cell)


                driver.findElement(By.xpath(readLocator(SONSelectors, "Cell"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCells.get(i)))).click();
                    Thread.sleep(3000);
                    element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCellOne.get(i))));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();
                    Thread.sleep(2000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                    Thread.sleep(2000);
                }
            }

            //-------------------------------------------------------------
            case "Region Band" -> {
                //Object Selection (Region Band)

/*
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
                driver.findElement(By.xpath(readLocator(SONSelectors,"TDDCloseArrow")));*/


                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);

                    element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i))));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();


                    for (String s : relatedElementsXDD) {
                        driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();

                }
            }
            //-------------------------------------------------------------
            case "Region XDD" -> {
                //Object Selection (Region XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    for (String s : relatedElementsXDD) {
                        element = driver.findElement(By.xpath(readLocator(SONSelectors, s)));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                        element.click();


                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();

                }
            }
            //-------------------------------------------------------------
            case "Cluster" -> {
                //Object Selection (Cluster)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Cluster"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                if (Technology.equals("4G")) {
                    driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                    Thread.sleep(2000);

                    for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                        Thread.sleep(1000);
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsClusterOne.get(i)))).click();

                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionCClose.get(i)))).click();
                    }
                } else {
                    for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                        Thread.sleep(1000);
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();

                        element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsCluster.get(i))));
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                        element.click();

                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                    }
                }
            }

            //-------------------------------------------------------------------

            case "Cluster Band" -> {
                //Object Selection (Cluster Band)
                driver.findElement(By.xpath(readLocator(SONSelectors, "ClusterBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);
                if (!Technology.equals("4G")) {
                    driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                    Thread.sleep(2000);
                    for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                        Thread.sleep(1000);
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsCluster.get(i)))).click();
                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionClose.get(i)))).click();
                    }
                } else {
                    driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                    Thread.sleep(2000);

                    for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                        Thread.sleep(1000);
                        driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsClusterOne.get(i)))).click();

                        driver.findElement(By.xpath(readLocator(PMSelectors, relatedElementsRegionCClose.get(i)))).click();
                    }

                }
            }
            //-------------------------------------------------
            case "PLMN XDD" -> {
                //Object Selection (PLMN XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
            }

            //-------------------------------------------------

            case "Sector" -> {
                //Object Selection (Sector)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Sector"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSector.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
            }

            //-------------------------------------------------

            case "Governorate" -> {
                //Object Selection (Governorate)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Governorate"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                for (String s : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();
                    Thread.sleep(1000);

                }
            }

            //-------------------------------------------------

            case "Governorate XDD" -> {
                //Object Selection (Governorate XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDArrow"))).click();
                for (String s : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDClose"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDArrow"))).click();
                for (String s : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDClose"))).click();
            }

            //-------------------------------------------------

            case "Governorate Band" -> {
                //Object Selection (Governorate Band)

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
            }
            //----------------------------------------------------
            case "BSC" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "BSC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (String s : relatedElementsBSC) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();

                }
            }
            case "RNC" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "RNC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 1; i < 5; i++) {

                    driver.findElement(By.xpath("//p-treenode[1]/li[1]/ul[1]/p-treenode[" + i + "]/li[1]")).click();
                }
            }
            case "Region Carrier" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsEastAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsWestAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsSouthJordan"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsNorthJordan"))).click();
            }
            case "PLMN Carrier" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 1; i < 3; i++) {

                    driver.findElement(By.xpath("//span[contains(text(),'F" + i + "')]")).click();
                }
            }
        }
    }

    void selectResolution(WebDriver driver, String ResolutionTemp, String SonType) throws InterruptedException {
        String scroll;
        if (SonType.equals("Azimuth Discrepancy")) {
            scroll = "//button[contains(text(),'" + NeighborType + "')]";
        } else if (!SonType.equals("4g congested cells") & !SonType.equals("4G Balance")) {
            scroll = readLocator(SONSelectors, "ExcludeOptions");
        } else if (SonType.equals("4G Balance")) {
            scroll = readLocator(SONSelectors, "Carrier");
        } else {
            scroll = readLocator(SONSelectors, "DailyBH");
        }

        Thread.sleep(1000);
        if (!ResolutionTemp.equals("")) {
            String startDate;
            WebElement element = driver.findElement(By.xpath(scroll));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            switch (ResolutionTemp) {
                case "Hourly" -> {
                    startDate = support.date("Last week");
                   /* WebElement element = driver.findElement(By.xpath(scroll));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
*/
                    //WebUI.scrollToElement(findTestObject(scroll), 0);
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //----------------------------------------------

                case "Daily" -> {
                    if (!SonType.equals("Azimuth Discrepancy")) {
                        driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                    startDate = support.date("Last week");
                    System.out.println(startDate);
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //---------------------------------------------

                case "Weekly" -> {
                    // WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Weekly"))).click();
                    startDate = support.date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //------------------------------------------

                case "Monthly" -> {
                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Monthly"))).click();
                    startDate = support.date("Last Month");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //---------------------------------------

                case "DailyBH" -> {

                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    if (!SonType.equals("4g congested cells")) {

                        driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                        driver.findElement(By.xpath(readLocator(SONSelectors, "DailyBH"))).click();
                    }
                    startDate = support.date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //------------------------------------------

                case "WeeklyBH" -> {

                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "WeeklyBH"))).click();
                    startDate = support.date("Last week");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                //------------------------------------------
                case "MonthlyBH" -> {
                    // WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "MonthlyBH"))).click();
                    startDate = support.date("Last Month");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
                case "Raw" -> {
                    //WebUI.scrollToElement(findTestObject('Object Repository/SON/Exclude Options'), 0)
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, "Raw"))).click();
                    startDate = support.date("Yesterday");
                    driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
                }
            }

            driver.findElement(By.xpath(readLocator(SONSelectors, "Year"))).click();
            driver.findElement(By.xpath("//span[normalize-space(text())='" + startYear + "']")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//span[normalize-space()='" + startMonth + "']")).click();
            driver.findElement(By.xpath("(//span[text()='" + startDay + "'])[1]")).click();


            startDate = support.date("Today");
            System.out.println(startDate);
            driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(readLocator(SONSelectors, "Year"))).click();
            driver.findElement(By.xpath("//span[normalize-space(text())='" + endYear + "']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[normalize-space()='" + endMonth + "']")).click();


            try {
                // Attempt to click the first matching element
                driver.findElement(By.xpath("(//span[text()='" + endDay + "'])[1]")).click();
            } catch (Exception e) {
                // If the first element is not clickable, attempt the second one
                System.out.println("First element not clickable, trying the second one.");
                driver.findElement(By.xpath("(//span[text()='" + endDay + "'])[2]")).click();
            }

        }
    }

}

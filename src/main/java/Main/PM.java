package Main;

import org.openqa.selenium.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

import static Main.DataController.*;

import static Main.MainClass.driver;
import static Main.SetupFunctions.*;
import static Main.SetupFunctions.SONSelectors;
import Main.Export.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    List<String> selectedObjects = new ArrayList<>();
    Functions support = new Functions();
    Export exporting=new Export();

    int objectNumber;

    //-------------------------Stats-----------------------------------
    public void Stats(String Vendor, String Technology, String ObjectType, boolean Aggregation, String Resolution, String KPI, boolean export) throws Exception {

        //Click on the PM
        support.login("PM");
        Thread.sleep(1000);

        //Vendor Selection
        if (Vendor.equals("Nokia")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Nokia"))).click();
        } else if (Vendor.equals("Mix")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Mix"))).click();
        }
        Thread.sleep(500);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Wait up to 50 seconds

        // Wait until the element is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))));

        //Technology Selection
        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();
        Thread.sleep(1000);

        //Object type Selection
        selectObjectType(ObjectType, Technology);

        if (Aggregation) {
            driver.findElement(By.xpath(readLocator(PMSelectors, "AggregationBtn"))).click();
        }
        //Set Resolution
        selectResolution(driver, Resolution);

        //KPI Selection

        String parent = searchKPI(KPI);

        //Apply and Verify

        if(!export) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();

            if (objectNumber > 6 & !Aggregation) {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readLocator(PMSelectors, "OkBtn"))));
                driver.findElement(By.xpath(readLocator(PMSelectors, "OkBtn"))).click();
            }

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(readLocator(SONSelectors, "HomeLogo"))));

            try {

                bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

                Assert.assertFalse(bt);
            } catch (Exception e) {
                Assert.assertFalse(bt);
            }

            //Verify the Selected API
            if (!KPI.equals("All")) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//app-main-chart-component[1]/div[1]/div[1]/div[1]/div[1]")));

                try {
                    Thread.sleep(2000);
                    if (objectNumber <= 6 & !Aggregation) {
                        for (int i = 0; i < selectedObjects.size(); i++) {
                            String title = driver.findElement(By.xpath("//app-main-chart-component[" + (i + 1) + "]/div[1]/div[1]/div[1]/div[1]")).getText();
                            System.out.println(title);

                            Assert.assertEquals(title, parent + " " + selectedObjects.get(i));

                        }
                    } else {
                        String title = driver.findElement(By.xpath("//app-main-chart-component[1]/div[1]/div[1]/div[1]/div[1]")).getText();
                        System.out.println(title);

                        Assert.assertEquals(title, parent);
                    }
                } catch (Exception e) {
                    boolean noData = driver.findElement(By.xpath("//div[contains(text(),'No data found')]")).isDisplayed();
                    Assert.assertTrue(noData);

                    System.out.println("No Data");
                }

            }
        }
        else  {
            exporting.export();
        }
    }

    //-------------------------TopX-----------------------------------
    public void TopX(String Vendor, String Technology, String ObjectType, String Resolution, Boolean lowX) throws Exception {
        Functions support = new Functions();
        //Click on the PM
        support.login("PM");
        Thread.sleep(500);

        //Vendor Selection
        if (Vendor.equals("Nokia")) {
            driver.findElement(By.xpath(readLocator(SONSelectors, "Huawei"))).click();
            driver.findElement(By.xpath(readLocator(SONSelectors, "Nokia"))).click();
        }


        driver.findElement(By.xpath(readLocator(SONSelectors, "TechnologyArrow"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + Technology + "']")).click();

        driver.findElement(By.xpath(readLocator(PMSelectors, "TopX"))).click();
        Thread.sleep(1000);
        selectObjectType(ObjectType, Technology);

        //Set Resolution
        selectResolutionTopX(driver, Resolution);

        //-----------------------------

        if (lowX) {
            Thread.sleep(1000);


            driver.findElement(By.xpath(readLocator(PMSelectors, "lowXCheckbox"))).click();

        }

        //KPI Selection
        driver.findElement(By.xpath(readLocator(PMSelectors, "KPI"))).click();

        //Apply and Verify
        driver.findElement(By.xpath(readLocator(SONSelectors, "ApplyButton"))).click();

        Thread.sleep(20000);
        try {

            bt = driver.findElement(By.xpath(readLocator(SONSelectors, "HomeLogo"))).isDisplayed();

            Assert.assertFalse(bt);
        } catch (Exception e) {
            Assert.assertFalse(bt);
        }


    }

    void selectObjectType(String ObjectType, String Technology) throws Exception {

        driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectSelection"))).click();
        relatedElements = readTags("Regions", SONSelectors);
        relatedElementsXDD = readTags("XDD", SONSelectors);
        relatedElementsRegionArrow = readTags("RegionArrow", SONSelectors);
        relatedElementsRegionClose = readTags("RegionClose", PMSelectors);
        //For 4G clusters
        relatedElementsRegionCClose = readTags("RegionCClose", PMSelectors);
        relatedElementsGovernorate = readTags("Governorates", SONSelectors);
        relatedElementsSites = readTags("Sites", SONSelectors);
        relatedElementsCells = readTags("Cells", SONSelectors);
        relatedElementsCellOne = readTags("CellOne", SONSelectors);
        relatedElementsBSC = readTags("BSCS", SONSelectors);
        relatedElementsCluster = readTags("Clusters", PMSelectors);
        relatedElementsClusterOne = readTags("ClusterO", PMSelectors);
        relatedElementsSector = readTags("Sectors", SONSelectors);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Wait up to 50 seconds
        int Regions;
        switch (ObjectType) {
            case "PLMN" -> {
                //Object Selection (PLMN)
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMN"))).click();

                //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))));
                Thread.sleep(2000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
            }

            //-------------------------------------------------------------
            case "Region" -> {
                //Object Selection (Region)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Region"))).click();
                Thread.sleep(1000);
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (String relatedElement : relatedElements) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElement))).click();

                }
                objectNumber = relatedElements.size();
            }
            //-------------------------------------------------------------
            case "Site" -> {
                //Object Selection (Site)
                Regions = relatedElementsRegionArrow.size();
                driver.findElement(By.xpath(readLocator(SONSelectors, "Site"))).click();
                Thread.sleep(1000);
                if (!Technology.equals("4G")) {
                    Regions = relatedElementsRegionArrow.size() - 1;
                }
                for (int i = 0; i < Regions; i++) {
                    Thread.sleep(2000);
                    String region = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)) + "/ancestor::li[1]")).getAttribute("aria-label");
                    System.out.println(region);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(2000);

                    element = driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSites.get(i))));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                    element.click();

                    String site = element.getText();
                    selectedObjects.add("(" + region + ")" + " " + "(" + site + ")");
                    System.out.println(selectedObjects);

                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))));

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
                objectNumber = Regions;
                System.out.println(objectNumber);
            }
            //-------------------------------------------------------------
            case "Cell" -> {

                //Object Selection (Cell)

                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(PMSelectors, "Cell"))).click();
                if (!Technology.equals("4G")) {
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
                objectNumber = relatedElementsRegionArrow.size();
            }

            //-------------------------------------------------------------
            case "Region Band" -> {
                //Object Selection (Region Band)


                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                for (int i = 0; i < relatedElementsRegionArrow.size(); i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    for (String s : relatedElementsXDD) {
                        driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();

                }
                objectNumber = relatedElementsRegionArrow.size();
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
                        driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();
                    }
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();

                }
                objectNumber = relatedElementsRegionArrow.size();
            }
            //-------------------------------------------------------------
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
                objectNumber = relatedElementsRegionArrow.size();
            }
            //-------------------------------------------------------------
            case "Cluster" -> {
                //Object Selection (Cluster)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Cluster"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

                //driver.findElement(By.xpath(readLocator(PMSelectors, "ClusterFDDArrow"))).click();
                Thread.sleep(2000);
                if (!Technology.equals("4G")) {
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
                objectNumber = relatedElementsRegionArrow.size();
            }
            //-------------------------------------------------
            case "PLMN XDD" -> {
                //Object Selection (PLMN XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNXDD"))).click();
                if (!Technology.equals("4G")) {
                    element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                }
                Thread.sleep(2000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
            }

            //-------------------------------------------------

            case "Sector" -> {
                //Object Selection (Sector)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Sector"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Regions = relatedElementsRegionArrow.size();
                if (Objects.equals(Technology, "3G")) {
                    Regions = relatedElementsRegionArrow.size() - 1;
                }
                for (int i = 0; i < Regions; i++) {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionArrow.get(i)))).click();
                    Thread.sleep(1000);

                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsSector.get(i)))).click();
                    driver.findElement(By.xpath(readLocator(SONSelectors, relatedElementsRegionClose.get(i)))).click();
                }
                objectNumber = Regions;
            }

            //-------------------------------------------------

            case "Governorate" -> {
                //Object Selection (Governorate)

                driver.findElement(By.xpath(readLocator(SONSelectors, "Governorate"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                for (String s1 : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s1))).click();

                }
            }

            //-------------------------------------------------

            case "Governorate XDD" -> {
                //Object Selection (Governorate XDD)

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateXDD"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDArrow"))).click();
                for (String item : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, item))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateFDDClose"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDArrow"))).click();
                for (String value : relatedElementsGovernorate) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, value))).click();

                }
                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateTDDClose"))).click();
                objectNumber = 7;
            }

            //-------------------------------------------------

            case "Governorate Band" -> {
                //Object Selection (Governorate Band)

                driver.findElement(By.xpath(readLocator(SONSelectors, "GovernorateBand"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCheckbox"))).click();
                objectNumber = 7;
            }
            //----------------------------------------------------
            case "BSC" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "BSC"))).click();
                Thread.sleep(1000);
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                for (String s : relatedElementsBSC) {

                    driver.findElement(By.xpath(readLocator(SONSelectors, s))).click();
                    Thread.sleep(1000);


                }
                objectNumber = relatedElementsBSC.size();
            }
            case "RNC" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "RNC"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);
                for (int i = 1; i < 5; i++) {

                    driver.findElement(By.xpath("//p-treenode[1]/li[1]/ul[1]/p-treenode[" + i + "]/li[1]")).click();

                    String Test = driver.findElement(By.xpath("//p-treenode[1]/li[1]/ul[1]/p-treenode[" + i + "]/li[1]")).getText();
                    selectedObjects.add("(" + Test + ")");
                    System.out.println(selectedObjects);
                }
            }
            case "Region Carrier" -> {
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionCarrier"))).click();
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(1000);
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsEastAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsWestAmman"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsSouthJordan"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "RegionsNorthJordan"))).click();
                objectNumber = 7;
            }
            case "PLMN Carrier" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "PLMNCarrier"))).click();
                Thread.sleep(2000);
                element = driver.findElement(By.xpath(readLocator(SONSelectors, "ObjectBorder")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                Thread.sleep(2000);
                for (int i = 1; i < 3; i++) {

                    driver.findElement(By.xpath("//span[contains(text(),'F" + i + "')]")).click();
                    String Test = driver.findElement(By.xpath("//span[contains(text(),'F" + i + "')]")).getText();
                    selectedObjects.add("(" + Test + ")");
                    System.out.println(selectedObjects);
                }
            }
        }
    }

    void selectResolution(WebDriver driver, String ResolutionTemp) throws InterruptedException {


        Thread.sleep(1000);
        String startDate;

        String scroll;
        scroll = readLocator(SONSelectors, "ExcludeOptions");
        WebElement element = driver.findElement(By.xpath(scroll));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        startDate = support.date("Last week");
        WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Data and time')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
        switch (ResolutionTemp) {
            case "Hourly" -> driver.findElement(By.xpath("//button[contains(text(),'" + startDate + "')]")).click();

            //----------------------------------------------

            case "Daily" -> {
                driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
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
                WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Data and time')]"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
                driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "DailyBH"))).click();
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
        Thread.sleep(1000);

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

    void selectResolutionTopX(WebDriver driver, String ResolutionTemp) throws InterruptedException {


        Thread.sleep(1000);


        String scroll;
        scroll = readLocator(PMSelectors, "LowX");
        WebElement element = driver.findElement(By.xpath(scroll));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        switch (ResolutionTemp) {

            case "Hourly":

                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "Hourly"))).click();

                break;
            //----------------------------------------------
            case "Daily":

                break;
            //---------------------------------------------

            case "Weekly":
                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "Weekly"))).click();

                break;
            //------------------------------------------

            case "Monthly":
                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "Monthly"))).click();
                break;

            //---------------------------------------

            case "DailyBH":
                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "DailyBH"))).click();


                break;
            //------------------------------------------

            case "WeeklyBH":
                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "WeeklyBH"))).click();
                break;
            //------------------------------------------
            case "MonthlyBH":
                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "MonthlyBH"))).click();

                break;
            case "Raw":

                driver.findElement(By.xpath(readLocator(SONSelectors, "Daily"))).click();
                driver.findElement(By.xpath(readLocator(SONSelectors, "Raw"))).click();

                break;
        }
        driver.findElement(By.xpath(readLocator(PMSelectors, "BeforeDate"))).click();
        driver.findElement(By.xpath(readLocator(SONSelectors, "Year"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + startYear + "']")).click();

        // driver.findElement(By.xpath(readLocator(PMSelectors, "ChooseMonth"))).click();
        // driver.findElement(By.xpath(readLocator(PMSelectors, "Feb"))).click();
        driver.findElement(By.xpath("//span[normalize-space()='" + startMonth + "']")).click();
        // driver.findElement(By.xpath(readLocator(PMSelectors, "DayOne"))).click();
        driver.findElement(By.xpath("(//span[text()='" + startDay + "'])[1]")).click();
        driver.findElement(By.xpath(readLocator(PMSelectors, "OK"))).click();
        driver.findElement(By.xpath(readLocator(PMSelectors, "AfterDate"))).click();

        driver.findElement(By.xpath(readLocator(SONSelectors, "Year"))).click();
        driver.findElement(By.xpath("//span[normalize-space(text())='" + endYear + "']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='" + endMonth + "']")).click();
        try {
            // Attempt to click the first matching element
            driver.findElement(By.xpath("(//span[text()='" + endDay + "'])[1]")).click();
        } catch (Exception e) {
            // If the first element is not clickable, attempt the second one
            System.out.println("First element not clickable, trying the second one.");
            driver.findElement(By.xpath("(//span[text()='" + endDay + "'])[2]")).click();
        }


        /*driver.findElement(By.xpath(readLocator(PMSelectors, "ChooseMonth"))).click();
        driver.findElement(By.xpath(readLocator(PMSelectors, "Feb"))).click();
        driver.findElement(By.xpath(readLocator(PMSelectors, "DaySeven"))).click();*/
        driver.findElement(By.xpath(readLocator(PMSelectors, "OK"))).click();

    }

    //------------------------------------------------------------------------------------------


    public String searchKPI(String KPI) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
        String parent = "";
        if (!KPI.equals("All")) {
            WebElement inputField = driver.findElement(By.xpath(readLocator(PMSelectors, "searchKPI")));
            inputField.sendKeys(KPI + Keys.ENTER);
            int attempts = 0;
            boolean success = false;
            while (attempts < 3 && !success) {
                try {
                    // Locate and interact with the element
                    //  Thread.sleep(3000);
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'" + KPI + "')]")));

                    WebElement button = driver.findElement(By.xpath("//div[contains(text(),'" + KPI + "')]"));
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
                    button.click();
                    parent = driver.findElement(By.xpath("//app-kpi-tree/div[2]/div[2]/p-tree/div/div/ul/p-treenode/li/ul/p-treenode[1]/li/ul/p-treenode[1]/li/div/span/span/div/div/div")).getText();
                    System.out.println(parent);
                    success = true; // Exit loop if successful
                } catch (org.openqa.selenium.StaleElementReferenceException e) {
                    System.out.println("Stale Element Exception encountered. Retrying...");
                }
                attempts++;
            }


        } else {
            driver.findElement(By.xpath(readLocator(PMSelectors, "KPI"))).click();
        }
        return parent;
    }

}

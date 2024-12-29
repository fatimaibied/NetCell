package Main;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static Main.DataController.*;
import static Main.SetupFunctions.*;


public class MainClass implements ITestListener {
    public static WebDriver driver;
    public ExtentTest testResult;
    public static ArrayList<String> wid;

    @BeforeSuite
    public void setupReport() throws IOException {
        initializeReport();
        driverSettings(URL);

    }

    @BeforeMethod
    public void setUp(ITestResult result) {
        // Set the report name using the class name
        report.config().setReportName(result.getTestClass().getName());

        // Create a logger for the current test
        logger = extent.createTest(result.getMethod().getMethodName(), result.getTestClass().getName());
        logger.log(Status.INFO, "Starting the test: " + result.getMethod().getMethodName());
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        // Log test results to the existing logger
        logTestResult(result);

        // Close driver and switch to the main window
        cleanUpDriver();
    }

    private void logTestResult(ITestResult result) {
        String packageName = "Package Name: " + result.getTestClass();
        String methodName = result.getName();

        switch (result.getStatus()) {
            case ITestResult.SUCCESS:
                logger.log(Status.PASS, packageName);
                logger.log(Status.PASS, methodName);
                break;

            case ITestResult.FAILURE:
                logger.log(Status.FAIL, packageName);
                logger.log(Status.FAIL, methodName);
                logger.log(Status.FAIL, "Element Name: " + elementName);
                try {
                    logger.fail(result.getThrowable().getMessage(),
                            MediaEntityBuilder.createScreenCaptureFromPath(screenShotOnFailure(result)).build());
                } catch (Exception e) {
                    logger.log(Status.FAIL, "Screenshot capture failed: " + e.getMessage());
                }
                break;

            default:
                logger.log(Status.SKIP, "Test skipped: " + methodName);
                break;
        }
    }

    private void cleanUpDriver() {
        if (driver != null) {
            driver.close();
            wid = new ArrayList<>(driver.getWindowHandles());
            if (!wid.isEmpty()) {
                driver.switchTo().window(wid.get(0));
            }
        }
    }


    @AfterSuite
    public void closeTest() throws IOException {
        driver.close();
        extent.flush();

        File file = new File(extentReportPath);
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file);


    }


}






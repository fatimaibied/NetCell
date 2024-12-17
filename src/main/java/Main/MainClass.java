package Main;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.model.Media;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import static Main.DataController.*;
import static Main.SetupFunctions.*;


public class MainClass implements ITestListener {
    public static WebDriver driver;
    public  ExtentTest testResult;
    public static ArrayList<String> wid;
    Functions support = new Functions();



    @BeforeSuite
    public void setupReport() throws IOException {
        initializeReport();
        driverSettings(URL);

    }


    @AfterMethod
    public void getResult(ITestResult Result) {
        testResult = extent.createTest(Result.getName());
        if (Result.getStatus()==ITestResult.SUCCESS){
            testResult.log(Status.PASS,"Package Name"+Result.getTestClass());
            testResult.log(Status.PASS,Result.getName());

        }
        if (Result.getStatus()==ITestResult.FAILURE){
            testResult.log(Status.FAIL,"Package Name"+Result.getTestClass());
            testResult.log(Status.FAIL,Result.getName());
            testResult.log(Status.FAIL, "Element Name" +" "+elementName);
            testResult.fail(Result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(screenShotOnFailure(Result)).build());
        }

     driver.close();
        wid = new ArrayList<>(driver.getWindowHandles());
      driver.switchTo().window(wid.get(0));
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






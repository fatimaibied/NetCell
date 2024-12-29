package Main;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.apache.commons.io.FileUtils;

import static Main.DataController.*;

public class SetupFunctions extends MainClass {
    public static String login = System.getProperty("user.dir") + "\\src\\test\\resources\\Login.xml";
    public static String home = System.getProperty("user.dir") + "\\src\\test\\resources\\Home.xml";
    public static String SONSelectors = System.getProperty("user.dir") + "\\src\\test\\resources\\SON.xml";
    public static String CMSelectors = System.getProperty("user.dir") + "\\src\\test\\resources\\CM.xml";
    public static String PMSelectors = System.getProperty("user.dir") + "\\src\\test\\resources\\PM.xml";

    public static String reportPath = System.getProperty("user.dir") + "\\Reports\\";
    public static String extentReportPath;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public static String elementName;
    public static DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
    public static ExtentSparkReporter report;
    public static Node node = null;
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static String screenShotLocationXMLPath = System.getProperty("user.dir") + "\\ScreenShots\\";

    public static List readTags(String elementTag, String elementsPath) throws Exception {


        String xmlFile = elementsPath;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFile);
        Element root = doc.getDocumentElement();
        List<String> list2 = new ArrayList<>();
        int n = 0;

        NodeList list = root.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {
            node = list.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                if (node.getNodeName().startsWith(elementTag)) {

                    list2.add(n, node.getNodeName());
                    n++;

                }

            }

        }

        return list2;

    }

    public static String readLocator(String XMLFile, String element) {

        String elementValue = "";
        File Resource = null;
        elementName = element;

        // Check if the File exists and has values
        try {
            Resource = new File(XMLFile); // Define file path to object from File type
            //Check if resource exists and is a file not a directory to start processing the file data
            org.junit.Assert.assertTrue("XMLFile location isn't exist --> " + XMLFile, Resource.exists() && !Resource.isDirectory());
            //Check if the file has data or isEmpty
            org.junit.Assert.assertTrue("XMLFile hasn't data --> " + XMLFile, Resource.length() != 0);
        } catch (Throwable throwable) {
            throwable.printStackTrace(System.out);
            org.junit.Assert.fail("Something went wrong, check the log");
        }

        try {
            //Read provided file and check element exist
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            //Parsing the File data as document
            Document document = documentBuilder.parse(Resource);
            //Formatting File data to start processing
            document.getDocumentElement().normalize();

            // Read provided tag from XML and return its node list object
            NodeList nodeList = document.getElementsByTagName(element);
            // Check if the tag element exist or not
            org.junit.Assert.assertNotEquals("The tag element isn't exist --> " + element + " in " + XMLFile, 0, nodeList.getLength());

            // Get element value and save in element value variable
            elementValue = nodeList.item(0).getTextContent();
        } catch (Throwable throwable) {
            throwable.printStackTrace(System.out);
            org.junit.Assert.fail("Something went wrong, check the log for --> " + XMLFile);
        }
        //Check if the element is null value
        org.junit.Assert.assertFalse("The element hasn't value --> " + element + " in " + XMLFile, elementValue == null);
        //Check the element isEmpty
        org.junit.Assert.assertFalse("The element hasn't value --> " + element + " in " + XMLFile, elementValue.isEmpty());
        return elementValue;
    }

    public static WebDriver driverSettings(String url) {
        if (driver == null) {
            System.setProperty("webdriver.http.factory", "jdk-http-client");

            if (browserType.equals("Chrome")) {
                    // Setup ChromeDriver using WebDriverManager
                    WebDriverManager.chromedriver().setup();

                    // Create Chrome options
                    ChromeOptions options = new ChromeOptions();

                    // Comprehensive download preferences
                    Map<String, Object> prefs = new HashMap<>();

                    // Specify download directory
                    String downloadPath = System.getProperty("user.dir") + "\\ExportedReport\\";
                    // Download configuration
                    prefs.put("download.default_directory", downloadPath);
                    prefs.put("profile.default_content_setting_values.automatic_downloads", 1);

                options.addArguments("--disable-features=InsecureDownloadWarnings");

                    // Set Chrome preferences
                    options.setExperimentalOption("prefs", prefs);

                    // Initialize WebDriver
                    driver = new ChromeDriver(options);
            }

            if (browserType.equals("FireFox")) {
                //For firefox driver call
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }

            if (browserType.equals("Edge")) {
                //For Edge driver call
                WebDriverManager.edgedriver().setup();
                Map<String, Object> prefs = new HashMap<>();

                // Specify download directory
                String downloadPath = System.getProperty("user.dir") + "\\ExportedReport\\";
                // Download configuration
                prefs.put("download.default_directory", downloadPath);
                EdgeOptions options=new EdgeOptions();
                options.setExperimentalOption("prefs", prefs);

                driver = new EdgeDriver(options);

            }
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
            driver.navigate().to(url); //Navigate to the entered url in the top
            driver.manage().window().maximize(); //Enlarge the browser page


        } else {

            driver.navigate().to(url); //Navigate to the entered url in the top

        }

        return driver;
    }

    public static String screenShotOnFailure(ITestResult Result) {


        Date date = new Date();

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {

            String pathSNP = screenShotLocationXMLPath;
            File dir = new File(pathSNP);
            dir.getParentFile().mkdirs();
            String path = pathSNP + Result.getName() + " " + dateFormat.format(date) + ".png";

            FileUtils.copyFile(file, new File(path));

            return path;

        } catch (IOException e2) {

            Result.getThrowable().printStackTrace();
            System.out.print("failed");

        }

        return null;

    }

    public static void initializeReport() {

        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");

        Date date = new Date();

        extentReportPath = reportPath + "NetCell" + dateFormat.format(date) + ".html";
        report = new ExtentSparkReporter(extentReportPath);
        extent = new ExtentReports();
        report.config().setDocumentTitle("Automation Report");
        //report.config().setReportName("<img src='http://netcellcert.com/assets/Logo.svg' style='height:30px;background-color: white;'>");
        report.config().setCss(
                ".badge-primary {" +
                        "background-color:transparent;" +
                        "color: white; /* Adjust text color if necessary */" +
                        "font-size: 90%; /* Optional: Adjust font size */" +
                        "padding: 5px 10px; /* Optional: Adjust padding */" +
                        "border-radius: 5px; /* Optional: Add rounded corners */" +
                        "}"
        );
        report.config().setReportName(
                "<div style='display: flex;;justify-content: space-between; align-items: center;'>" +
                        "<img src='http://netcellcert.com/assets/Logo.svg' style='height:30px;background-color:white'>" +
                        "<span style='font-size: 20px; font-weight: bold; margin-left: 200px;margin-right: 340px;'>Automation Test Report</span>" +
                        "</div>"
        );

        extent.attachReporter(report);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Browser ", browserType);
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        report.config().setTheme(Theme.STANDARD);
        report.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm ");

        // report.loadXMLConfig(extentConfig);

    }

    public static void assertion(String actual, String expected) {

        Assert.assertEquals(expected, actual);
        logger.log(Status.PASS, "Assert" + "(Actual: " + actual + " ,Expected:" + expected + ")");

        try {

            Assert.assertEquals(expected, actual);
            logger.log(Status.PASS, "Assert" + "(Actual: " + actual + " ,Expected:" + expected + ")");
        } catch (Exception e) {
            logger.log(Status.FAIL, "Assert" + "(Actual: " + actual + " ,Expected:" + expected + ")");
        }
    }
}

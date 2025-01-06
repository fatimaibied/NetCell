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
import static Main.SetupFunctions.logger;

public class ExportCM extends MainClass {

    private ExcelUtil excelUtil;

    void export(String Vendor, String Technology, String ObjectType,String TargetType,String target)  throws Exception  {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200)); // Wait up to 50 seconds

        String sheetName=Vendor+"_"+ Technology+"_";
        driver.findElement(By.xpath("//app-left-side-menu[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(text(),'Export')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//app-notification[1]/button[1]/em[1]")).click();
        Thread.sleep(4000);

        // Wait for "In progress" message to disappear
        By progressMessage = By.xpath("//div[contains(text(),' In progress ')]");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(progressMessage));

        String fileName =driver.findElement(By.xpath("(//div[@class=\"p-element report-name body-bold-m\"])[1]")).getText();
        Thread.sleep(2000);

        // Wait for download button to be clickable and click it
        By downloadButton = By.xpath("(//em[@class=\"fa-regular fa-file-arrow-down download-regular-icon\"])[1]");
        wait.until(ExpectedConditions.elementToBeClickable(downloadButton));
        driver.findElement(downloadButton).click();
        Thread.sleep(4000);
        excelUtil = new ExcelUtil(System.getProperty("user.dir") + "\\ExportedReport\\"+fileName);
        //validateExcelData
        Thread.sleep(2000);
        exportData(target,Technology,ObjectType,TargetType);

    }

    public void exportData(String sheetName,String Technology, String ObjectType, String TargetType) throws Exception {

        int rowCount=excelUtil.getRowCount(sheetName);
        System.out.println(rowCount);
        for(int i=1;i<rowCount;i++){
            String actualConfigGroup = excelUtil.getCellData(sheetName, i, 1); // Row 1, Column 1

            String expectedConfigGroup = sheetName.toUpperCase();
            Assert.assertEquals(actualConfigGroup, expectedConfigGroup, "Cell data mismatch!");

            String actualObjectType = excelUtil.getCellData(sheetName, i, 2); // Row 1, Column 1

            String   expectedObjectType = TargetType;
            Assert.assertEquals(actualObjectType, expectedObjectType, "Cell data mismatch!");


           String actualTechnology = excelUtil.getCellData(sheetName, i, 3); // Row 1, Column 1

           String expectedTechnology = Technology;
            Assert.assertEquals(actualTechnology, expectedTechnology, "Cell data mismatch!");

            logger.log(Status.PASS, "Assert" + "(ConfigGroup Actual: " + actualConfigGroup + " ,ConfigGroup Expected:" + expectedConfigGroup +
                    " Object Type Actual: " + actualObjectType + " ,Object Type Expected:" + expectedObjectType +
                    " Technology Actual: " + actualTechnology + " ,Technology Expected:" + expectedTechnology +")");

        }

    }

}

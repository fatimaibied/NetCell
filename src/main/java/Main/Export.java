package Main;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Main.MainClass.driver;

public class Export {
    private ExcelUtil excelUtil;
    void export() throws Exception {
        String fileName="";
        driver.findElement(By.xpath("//app-left-side-menu[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[contains(text(),'Export')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//app-notification[1]/button[1]/em[1]")).click();
        Thread.sleep(2000);

        fileName =driver.findElement(By.xpath("(//div[@class=\"p-element report-name body-bold-m\"])[1]")).getText();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//em[@class=\"fa-regular fa-file-arrow-down download-regular-icon\"])[1]")).click();
        Thread.sleep(2000);


        //  excelUtil = new ExcelUtil("C:\\Users\\" + System.getProperty("user.name") + "\\Downloads\\"+fileName);
        excelUtil = new ExcelUtil(System.getProperty("user.dir") + "\\ExportedReport\\"+fileName);
        //validateExcelData
        Thread.sleep(2000);
        String actualData = excelUtil.getCellData("Huawei_4G_Hourly", 2, 0); // Row 1, Column 1
        String expectedData = "2024-02-01";
        Assert.assertEquals(actualData, expectedData, "Cell data mismatch!");

        // validateRowCount

        int actualRowCount = excelUtil.getRowCount("Huawei_4G_Hourly");
        int expectedRowCount = 144; // Change as per your expectations
        Assert.assertEquals(actualRowCount, expectedRowCount, "Row count mismatch!");

    }

}

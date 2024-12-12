package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.ArrayList;

import static Main.SetupFunctions.*;
import static Main.DataController.*;

public class Functions {

    public void login(String type) throws Exception {
        if (loginVar == 0) {
            Thread.sleep(1000);
            driver.findElement(By.xpath(readLocator(login, "UserName"))).sendKeys(userName);
            driver.findElement(By.xpath(readLocator(login, "Password"))).sendKeys(password);
            driver.findElement(By.xpath(readLocator(login, "LoginBtn"))).click();
            Thread.sleep(2000);
            WebElement welcome = driver.findElement(By.xpath(readLocator(home, "WelcomeMsg")));
            Assert.assertEquals(welcome.isDisplayed(), true);


            driver.findElement(By.xpath(readLocator(home, type))).click();
            Thread.sleep(1000);
            wid = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(wid.get(1));


            loginVar = 1;
        }

        else { /*if (wid.size()>1){
            driver.switchTo().window(wid.get(0));
            System.out.println( driver.getWindowHandles());
            System.out.println( driver.getWindowHandle());

        }*/
            Thread.sleep(1000);
            driver.findElement(By.xpath(readLocator(home, type))).click();
            Thread.sleep(1000);
            wid = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(wid.get(1));

        }
    }
    public void logout(){

        driver.findElement(By.xpath(readLocator(login, "UserSection"))).click();
        driver.findElement(By.xpath(readLocator(login, "Logout"))).click();
    }


}

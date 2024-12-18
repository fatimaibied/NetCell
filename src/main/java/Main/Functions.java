package Main;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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
            Assert.assertTrue(welcome.isDisplayed());


            driver.findElement(By.xpath(readLocator(home, type))).click();
            Thread.sleep(1000);
            wid = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(wid.get(1));


            loginVar = 1;
        } else { /*if (wid.size()>1){
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

    public void logout() {

        driver.findElement(By.xpath(readLocator(login, "UserSection"))).click();
        driver.findElement(By.xpath(readLocator(login, "Logout"))).click();
    }

    String date(String day) {

        String date = "";
        Calendar calendar = Calendar.getInstance();


        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");

        switch (day) {
            case "Last week" -> {

                //date = dateFormat.format(today)
                calendar.add(Calendar.DAY_OF_YEAR, -7);
                Date LastWeek = calendar.getTime();
                date = dateFormat.format(LastWeek);
                System.out.println(date);
            }
            case "Yesterday" -> {
                calendar.add(Calendar.DAY_OF_YEAR, -1);
                Date Yesterday = calendar.getTime();
                date = dateFormat.format(Yesterday);
            }
            case "Last Month" -> {
                calendar.add(Calendar.DAY_OF_YEAR, -30);
                Date LastMonth = calendar.getTime();
                date = dateFormat.format(LastMonth);
            }

            case "Today" -> {
                calendar.add(Calendar.DAY_OF_YEAR, 0);
                Date LastMonth = calendar.getTime();
                date = dateFormat.format(LastMonth);
            }
        }

        return date;
    }

}

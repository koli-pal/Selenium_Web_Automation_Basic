package com.automation.WindowTab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwitchtoTabs {
    WebDriver driver;
    @BeforeMethod
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void URL()throws InterruptedException{
        driver.get("https://www.geeksforgeeks.org/");
        Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void createNewTab()throws InterruptedException{
        String parentTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        String childTab = driver.getWindowHandle();
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        Thread.sleep(5000);

        driver.switchTo().window(parentTab);
        Thread.sleep(5000);
        driver.switchTo().window(childTab);
        Thread.sleep(5000);

    }
    @AfterSuite
    public void closebrowser(){
        driver.close();
    }
}

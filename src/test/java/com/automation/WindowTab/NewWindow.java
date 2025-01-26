package com.automation.WindowTab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindow {
    WebDriver driver;
    @BeforeMethod
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void URL()throws InterruptedException{
        driver.get("https://mvnrepository.com/");
        Thread.sleep(5000);
    }
    @Test(priority = 1)
    public void createNewTab()throws InterruptedException{
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        Thread.sleep(5000);
    }
    @AfterSuite
    public void closebrowser(){
        driver.quit();
    }
}

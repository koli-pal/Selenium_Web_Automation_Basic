package com.automation.WindowTab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class CountTab {
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
    public void countTabnumber()throws InterruptedException{
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        Thread.sleep(5000);

        Set<String> tab = driver.getWindowHandles();
        System.out.println("Number of tab is "+tab.size());
    }
    @AfterSuite
    public void closebrowser(){
        driver.quit();
    }
}

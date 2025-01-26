package com.automation.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class locatebylinktext {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void URL()throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        Thread.sleep(15000);
        WebElement element = driver.findElement(By.linkText("Home"));
        element.click();
        Thread.sleep(5000);

    }

    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }




}

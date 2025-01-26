package com.automation.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImpliciteWait {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void URL()throws InterruptedException {
        driver.get("https://www.daraz.com.bd/#?");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }




}

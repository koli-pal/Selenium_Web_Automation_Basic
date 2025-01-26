package com.automation.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Headlesschrome_Test {
    WebDriver driver;
   @BeforeSuite
    public void startbrowser(){

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();


    }
    @Test
    public void url() throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Thread.sleep(15000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }


}

package com.automation.browsercommand;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browsercommandexamples {
    WebDriver driver;
    String URL ="https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
   @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }@Test
    public void getcurrenturl()throws InterruptedException{
       driver.get(URL);
       Thread.sleep(5000);
       String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        if (URL.equals(currenturl)){
            System.out.println("current url is same as mentioned url");
        }else {
            System.out.println("current url is not same as mentioned url");
        }
    }
    @Test
    public void getpagesource(){
        System.out.println(driver.getPageSource());
    }
    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }





}

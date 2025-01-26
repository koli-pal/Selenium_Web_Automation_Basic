package com.automation.Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameLocateByID {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void URL()throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(5000);
        driver.switchTo().frame("frm2");
        WebElement element = driver.findElement(By.xpath("//input[@id='firstName']"));
        element.sendKeys("koli");
        Thread.sleep(5000);
    }


    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }




}

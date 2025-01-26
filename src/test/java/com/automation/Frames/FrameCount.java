package com.automation.Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class FrameCount {
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
        List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        System.out.println(iframe.size());
    }


    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }




}

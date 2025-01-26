package com.automation.locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class locatebytagname {
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
        List<WebElement> element = driver.findElements(By.tagName("a"));
        System.out.println(element.size());
        for (int i=0;i<=element.size();i++){
            System.out.println(element.get(i).getText());
        }
        Thread.sleep(5000);

    }

    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }




}

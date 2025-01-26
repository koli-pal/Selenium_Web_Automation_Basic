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

public class SwitchAndDefault {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void URL()throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
        Thread.sleep(5000);
        List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
        System.out.println(iframe.size());
        WebElement element = driver.findElement(By.xpath("//h1[contains(text(),'Selenium - Automation Practice Form')]"));
        System.out.println(element.getText());
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        WebElement element1 = driver.findElement(By.xpath("//h1[contains(text(),'Nested Frames')]"));
        System.out.println(element1.getText());
        Thread.sleep(5000);
    }


    @AfterSuite
    public void closeBrowser(){
        driver.close();
    }

}

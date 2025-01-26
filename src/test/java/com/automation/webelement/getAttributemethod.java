package com.automation.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class getAttributemethod {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }@Test
    public void openurl()throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        System.out.println(element.getAttribute("placeholder"));
        Thread.sleep(5000);
    }
    @AfterSuite
    public void closebrowser(){
        driver.close();
    }
}

package com.automation.selects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelectByvalueExample {
    WebDriver driver;
    @BeforeSuite
    public void startbrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }@Test
    public void openurl()throws InterruptedException{
        driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
        Thread.sleep(5000);
        WebElement dropdown = driver.findElement(By.id("inputGroupSelect03"));
        Select select = new Select(dropdown);
        select.selectByValue("1");

    }
    @AfterSuite
    public void closebrowser(){
        driver.close();
    }
}

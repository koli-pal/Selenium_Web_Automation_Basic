package com.automation.browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CrossBrowse_Test {
    String url = " ";
    WebDriver driver;
    String Browser = System.getProperty("browser","Firefox");

    @BeforeSuite
    public void startBrowser (){
        String Browser = System.getProperty("browser","chrome");
        if (Browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (Browser.equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();

        }else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }

    }
    @Test
    public void URL()throws InterruptedException {
        driver.get("https://mvnreposyitor.com/");
        Thread.sleep(15000);

    }
    @AfterSuite
    public void CloseBrowser(){
        driver.close();

    }
}

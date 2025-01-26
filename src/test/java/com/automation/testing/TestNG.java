package com.automation.testing;

import org.testng.annotations.*;

public class TestNG {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");

    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite");

    }
    @Test(priority = 1)
    public void testexample(){
        System.out.println("example");

    }@Test(priority=0)
    public void testexaple2(){
        System.out.println("example2");

    }@BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass");
    }
    @BeforeTest
    public void beforetestexample(){
        System.out.println("beforetestexample");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclass");
    }
    @AfterTest
    public void aftertestexample(){
        System.out.println("aftertestexample");
    }@BeforeMethod
    public void beforemethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("after method");
    }
}

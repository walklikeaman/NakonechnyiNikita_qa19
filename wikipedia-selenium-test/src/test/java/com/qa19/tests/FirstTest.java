package com.qa19.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class FirstTest {
    WebDriver webDriver;

    @BeforeClass
    public void setUp() {

        webDriver = new ChromeDriver();
    }

    @Test
    public void openChromeTest() {
        webDriver.get("https://www.google.com");
    }

    @AfterClass
    public void tearDown() {
        webDriver.quit();
    }
}

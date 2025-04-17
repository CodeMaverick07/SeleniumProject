package com.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testLoginPage() {
        driver.get("file:///C:/Users/HP/SeleniumProject/index.html"); // change this to your actual file path
        System.out.println("Page Title: " + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

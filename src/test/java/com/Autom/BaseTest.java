package com.Autom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver = null;
	public WebDriver GetWebDriver() throws IOException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
          driver.get("https://www.amazon.com/");
          driver.manage().window().maximize();
		  return driver;
    }
}
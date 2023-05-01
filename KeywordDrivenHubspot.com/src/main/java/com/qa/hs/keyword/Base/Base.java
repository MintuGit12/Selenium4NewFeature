package com.qa.hs.keyword.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
public WebDriver driver;
public Properties prop;
static {
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
	System.setProperty("webdriver.edge.driver","./msedgedriver.exe");
}
public WebDriver initDriver(String browser)
{
	
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			//WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
}
public Properties initProp() throws IOException
{
	prop=new Properties();
	FileInputStream fip=new FileInputStream("./com.qa.hs.keyword.hs/config.properties");
	prop.load(fip);
	return prop;
}
}

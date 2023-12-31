package com.crm.product;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Generic_utilities.BaseClass;
import com.crm.Generic_utilities.ListenerImplementationGrid;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridProgramBrowserStack{
	public WebDriver sdriver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	}
@Test
public void gridTest1() throws MalformedURLException
{
	System.out.println("test1 started in maven okk");
	//URL url=new URL("http://192.168.5.1:4444/wd/hub");

	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("browserstack.user", "purusottamkumars_WL8Vwq");
	dc.setCapability("browserstack.key","iKgBdVyuu8pnJYDa9pps");
	//System.getProperty("browser1")
	dc.setBrowserName("chrome");
	dc.setPlatform(Platform.WINDOWS);
	dc.setVersion("7");
	WebDriverManager.chromedriver().setup();
	URL url=new URL("http://hub.browserstack.com/wd/hub");
	WebDriver driver=new RemoteWebDriver(url,dc);
	this.sdriver=driver;
	ListenerImplementationGrid.listenerImplementationGrid(driver);
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	System.out.println("test1 ended maven in maven");
	driver.close();
	
}
@Test
public void gridTest2() throws MalformedURLException
{
	System.out.println("test2 started");

	//URL url=new URL("http://192.168.5.1:4444/wd/hub");
	
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("browserstack.user", "purusottamkumars_WL8Vwq");
	dc.setCapability("browserstack.key","iKgBdVyuu8pnJYDa9pps");
	//System.getProperty("browser1")
	dc.setBrowserName("Chrome");
	dc.setPlatform(Platform.MAC);
	dc.setVersion("Ventura");
	WebDriverManager.chromedriver().setup();
	URL url=new URL("http://hub.browserstack.com/wd/hub");
	WebDriver driver=new RemoteWebDriver(url,dc);
	this.sdriver=driver;
	
	ListenerImplementationGrid.listenerImplementationGrid(driver);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
	System.out.println("test2 ended");
	driver.close();
	
}
}

package com.crm.TestUdmy;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
static {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	}
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().create();
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		driver.close();

	}

}

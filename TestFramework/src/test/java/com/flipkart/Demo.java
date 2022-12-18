package com.flipkart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import io.appium.java_client.AppiumDriver;
import object_repository.HomePage;

public class Demo extends BaseClass{
	@Test
	public void m1()
	{
		AppiumDriver d=(AppiumDriver)driver;
HomePage h=new HomePage(driver)	;

}
}

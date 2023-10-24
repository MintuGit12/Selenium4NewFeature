package com.crm.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Pages {
	AndroidDriver driver;
	 @FindBy(xpath = "//android.widget.Button[@resource-id='com.android.permissioncontroller:id/continue_button']")
	    private WebElement ele;
	 public Pages(AndroidDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	public WebElement getElement() {
		return ele;
	}

}

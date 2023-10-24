package com.crm.flutter.Demo;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.base.AppGenericLib;
import com.crm.base.BaseClass;
import com.crm.base.Pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class MyFirstAPiDemos{

@Test
public void firstTest() throws InterruptedException, IOException
{
	AppiumDriverLocalService service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
			.usingDriverExecutable(new File("C:\\Program Files\\nodejs"))
			.withAppiumJS(new File("C:\\Users\\Adarsh\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js")));
	service.start();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"vivo 1804");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".ApiDemos");
	//dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\Adarsh\\AppData\\Local\\Android\\Sdk\\build-tools\\30.0.3\\ApiDemos-debug.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);	
		AppGenericLib appGen=new AppGenericLib();
		Thread.sleep(7000);
		//Pages p=new Pages(driver);
		//appGen.tapOnElement(driver,p.getElement());
		WebElement ele = driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/continue_button']"));
		appGen.tapOnElement(driver,ele);
		appGen.waitOrPause(driver, 5);
		WebElement ok = driver.findElement(By.id("android:id/button1"));
		appGen.tapOnElement(driver, ok);
		Assert.fail();
		appGen.waitOrPause(driver, 3);
		appGen.clickOnElement(driver, driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")));
		appGen.waitOrPause(driver, 5);
		appGen.scrollIntoText(driver, "Voice Recognition");
		WebElement voice_Rec = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Voice Recognition\"]"));
		appGen.clickOnElement(driver, voice_Rec);
		//File dest = appGen.takesScreenshot(driver, "Image1");
		//System.out.println(dest);
}

}

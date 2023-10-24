package com.crm.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public AndroidDriver driver;
	
public void startScript() throws MalformedURLException
{
	//AppiumDriverLocalService service=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingPort(4722).withLogFile(new File("./App/recent.log")));
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
		AndroidDriver aDriver=new AndroidDriver(url,dc);
		driver=aDriver;	
}
}

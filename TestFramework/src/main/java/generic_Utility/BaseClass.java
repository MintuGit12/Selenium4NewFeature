package generic_Utility;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public static AndroidDriver driver;
@BeforeClass
public void openServer()
{
//AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
//server.start();
}
@BeforeMethod
public void launchApp() throws IOException
{
	File_Utility f=new File_Utility();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,f.readPropertyData("automation_name"));
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,f.readPropertyData("platform_name"));
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,f.readPropertyData("platform_version"));
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,f.readPropertyData("device_name"));
	dc.setCapability(MobileCapabilityType.UDID,f.readPropertyData("device_id"));
	dc.setCapability("appPackage",f.readPropertyData("appPackage"));
	dc.setCapability("appActivity",f.readPropertyData("appActivity"));
	dc.setCapability(MobileCapabilityType.NO_RESET,true);
	URL url=new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
new MobileDriver_Utility().implicitWaiting(driver, 10);
}
@AfterMethod
public void logout()
{
	driver.closeApp();
}
@AfterClass
public void closeServer()
{
	
}
}

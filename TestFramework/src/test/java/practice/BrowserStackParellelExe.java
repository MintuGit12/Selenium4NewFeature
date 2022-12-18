package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStackParellelExe 
{
	@Parameters({"dev_name","os_ver"})
@Test
public void parellelBS(String dev_name,String os_ver) throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("browserstack.user", "purusottamkumars_WL8Vwq");
	dc.setCapability("browserstack.key", "iKgBdVyuu8pnJYDa9pps");
	
	dc.setCapability(MobileCapabilityType.APP, "bs://a5d9ecc8da3b8b0c81977a215aeba0b7862ae01c");
		
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,dev_name );
	dc.setCapability("os_version", os_ver);
	
	URL url=new URL("http://hub.browserstack.com/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.launchApp();
}
}

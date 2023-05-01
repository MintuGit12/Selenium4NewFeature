package keyword.utility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass {
public AndroidDriver driver;
public AppiumDriverLocalService server;
@BeforeClass
public void dbConn()
{
	System.out.println("database connection code");
}
@BeforeTest
public void beforeParellel()
{
	System.out.println("parellel execution code");
}
@BeforeClass
public void serverLaunch() throws IOException, InterruptedException
{
	//Runtime.getRuntime().exec("appium");
	Thread.sleep(6000);
//server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withArgument(GeneralServerFlag.SESSION_OVERRIDE).usingPort(4723).withLogFile(new File("./Logs/logs.txt")));
server=AppiumDriverLocalService.buildDefaultService();
	server.start();
}
@BeforeTest
public void loginApp() throws IOException
{
	PropertyReader p=new PropertyReader();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, p.propFileRead("automationName"));
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,  p.propFileRead("platformName"));
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, p.propFileRead("platformVersion"));
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, p.propFileRead("deviceName"));
	dc.setCapability(MobileCapabilityType.UDID,  p.propFileRead("udid"));
	dc.setCapability("appPackage",  p.propFileRead("appPackage"));
	dc.setCapability("appActivity", p.propFileRead("appAcvtivity"));
	//dc.setCapability(MobileCapabilityType.NO_RESET,true);
	URL url=new URL( p.propFileRead("localhostURL"));
	driver=new AndroidDriver(url,dc);
}
@AfterTest
public void logoutApp()
{
	driver.closeApp();
}
@AfterClass
public void killServer()
{
server.stop();
}
@AfterTest
public void afterParellel()
{
	System.out.println("parellel execution code");
}
@AfterTest
public void killDBConn()
{
	System.out.println("database connection code");
}
}

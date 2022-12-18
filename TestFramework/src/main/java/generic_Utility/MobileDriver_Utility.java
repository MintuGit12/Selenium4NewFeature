package generic_Utility;



import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriver_Utility {
public void tapElement(AndroidDriver driver,int fingure,MobileElement ele,int dur)
{
driver.tap(fingure, ele, dur);
}
public void tapElement(AndroidDriver driver,int fingure,int x,int y,int dur)
{
	driver.tap(fingure, x, y, dur);
}
public void implicitWaiting(AndroidDriver driver,int time)
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}

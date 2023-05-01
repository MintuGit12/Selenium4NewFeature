package keyword.utility;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class MobileDriver_Utility {
public void tapElement(AndroidDriver driver,WebElement ele)
{
	TouchAction touch=new TouchAction(driver);
	touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele)));
}

public void swapDown(AndroidDriver driver,int time,WebElement element)
{
	TouchAction action=new TouchAction<>(driver);
	for(int i=1;i<time;i++) {
	action.longPress(PointOption.point(0, 0)).moveTo(PointOption.point(0, 0)).release().perform();
	waitingCondition(driver, element);
	if(element.isDisplayed())
		element.click();
	else
		continue;
}
}
public void swapUp(AndroidDriver driver,int time,WebElement element)
{
	TouchAction action=new TouchAction<>(driver);
	for(int i=1;i<time;i++) {
	action.longPress(PointOption.point(0, 0)).moveTo(PointOption.point(0, 0)).release().perform();
	waitingCondition(driver, element);
	if(element.isDisplayed())
		element.click();
	else
		continue;
}
}
public void swapLeft(AndroidDriver driver,int time,WebElement element)
{
	TouchAction action=new TouchAction<>(driver);
	for(int i=1;i<time;i++) {
	action.longPress(PointOption.point(0, 0)).moveTo(PointOption.point(0, 0)).release().perform();
	waitingCondition(driver, element);
	if(element.isDisplayed())
		element.click();
	else
		continue;
}
}
public void swapRight(AndroidDriver driver,int time,WebElement element)
{
	TouchAction action=new TouchAction<>(driver);
	for(int i=1;i<time;i++) {
	action.longPress(PointOption.point(0, 0)).moveTo(PointOption.point(0, 0)).release().perform();
	waitingCondition(driver, element);
	if(element.isDisplayed())
		element.click();
	else
		continue;
}
}
public void hideKeyboard(AndroidDriver driver)
{
	driver.hideKeyboard();
}
public void waitingCondition(AndroidDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void toastMassege(AndroidDriver driver)
{
	driver.findElement(MobileBy.xpath("//android.widget.Toast[1]"));
}
//public void startApp(AndroidDriver driver,Activity app)
//{
//	driver.startActivity(app);;
//}
public void openNotification(AndroidDriver driver)
{
	driver.openNotifications();
}
public void toggleWIFI(AndroidDriver driver)
{
	if(!(driver.getConnection().isWiFiEnabled()))
		driver.toggleWifi();
}
public void toggleDATA(AndroidDriver driver)
{
	if(!(driver.getConnection().isDataEnabled()))
		driver.toggleData();
}
public void scrollToElement(AndroidDriver driver,String attributeName,String attributeValue)
{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).setMaxSearchSwipes(10).scrollIntoView(new UiSelector()."+attributeName+"("+attributeValue+"))");
}
public void tapElementByCoordinate(AndroidDriver driver, int parseInt, int y) {

		TouchAction touch=new TouchAction(driver);
		//touch.tap(TapOptions.tapOptions().withElement((ElementOption) PointOption.point(parseInt, y)));
	
}
}

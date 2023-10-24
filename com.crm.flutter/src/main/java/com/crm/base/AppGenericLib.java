package com.crm.base;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class AppGenericLib {
public void tapOnElement(AndroidDriver driver,WebElement ele)
{
	TouchAction touchAction=new TouchAction(driver);
	touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(ele))).perform();
}
public void tapOnElementPoint(AndroidDriver driver,int x,int y)
{
	TouchAction tAction=new TouchAction(driver);
	tAction.tap(PointOption.point(x, y)).perform();
}
public static String getSystemDate()
{
	SimpleDateFormat formater=new SimpleDateFormat("dd_MMM_YYYY_hh_mm_ss");
	String date = formater.format(new Date());
	return date;
	
}
public void scrollToVerticalElementAndClick(AppiumDriver driver,double start,double end)
{
TouchAction tAction=new TouchAction(driver);
double yStartPoint=driver.manage().window().getSize().getHeight();
double x=driver.manage().window().getSize().getWidth();
tAction.longPress(PointOption.point((int)(x/2),(int)(start*yStartPoint))).moveTo(PointOption.point((int)(x/2),(int)(end*yStartPoint))).release().perform();
}
public void awaitOfElement(AppiumDriver driver,WebElement ele)
{
	WebDriverWait wait=new WebDriverWait(driver, 5);
	try {
	wait.until(ExpectedConditions.visibilityOf(ele));
	}
	catch (Exception e) {
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
public void clickOnElement(AppiumDriver driver,WebElement ele)
{
	ele.click();
}
public void sendText(WebElement ele,String text)
{
	ele.sendKeys(text);
}
public void openNotification(AppiumDriver driver)
{
	AndroidDriver aDriver=(AndroidDriver)driver;
	aDriver.openNotifications();
}
public void turnOffDataWIFI(AppiumDriver driver)
{
	AndroidDriver androidDriver = (AndroidDriver) driver;
	if (androidDriver.getConnection().isWiFiEnabled()) {
		androidDriver.toggleWifi();
	}
	if (androidDriver.getConnection().isDataEnabled()) {
		androidDriver.toggleData();
	}
}
public void turnOnDataWIFI(AppiumDriver driver)
{
	AndroidDriver androidDriver=(AndroidDriver)driver;
	if(!androidDriver.getConnection().isWiFiEnabled())
	androidDriver.toggleWifi();
	if(androidDriver.getConnection().isDataEnabled())
		androidDriver.toggleData();
}
public void waitOrPause(AndroidDriver driver,long sec)
{
	try
	{
		Thread.sleep(sec*1000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
public void pressNevigationBack(AndroidDriver driver)
{
	driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.BACK));
}
public void pressEnterButton(AndroidDriver driver)
{
	driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.ENTER));
}
public void pressHomeButton(AndroidDriver driver)
{
	driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(AndroidKey.HOME));
}
public void executeADBCommand(AndroidDriver driver,String command)
{
	driver.execute(command);
}
public void executeCmdLineArg1(String cmd) throws IOException
{
	Runtime.getRuntime().exec(cmd);
}
public File takesScreenshot(WebElement ele,String imgName) throws IOException
{
	File src=ele.getScreenshotAs(OutputType.FILE);
	File dest=new File(String.format(".\\src\\test\\Img\\%s.png",imgName));
	Files.copy(src, dest);
	return dest;
}
public File takesScreenshot(AppiumDriver driver,String imgName) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/"+imgName+".png");
	Files.copy(src, dest);
	return dest;
}
public void hideKeyboard(AndroidDriver driver)
{
	driver.hideKeyboard();
}
public String getToastMessage(AndroidDriver driver)
{
	return driver.findElement(By.xpath("//android.widget.Toast")).getText();
}
public void scrollIntoText(AppiumDriver driver,String text)
{
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()"
			+ ".scrollable(true)).setMaxSearchSwipes(10)."
			+ "scrollIntoView(new UiSelector().text(\""+text+"\"))"));
}
public void executeCmdLineArg(String cmd) throws IOException {
	Runtime.getRuntime().exec(cmd);
	
}
}

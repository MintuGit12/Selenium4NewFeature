package com.flipkart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.MobileDriver_Utility;
import io.appium.java_client.MobileElement;
import object_repository.HomePage;

public class FlipkartAutomatePOM extends BaseClass{
@Test
public void flipkartWaterHeater() throws InterruptedException
{
MobileDriver_Utility mUtil=new MobileDriver_Utility();
HomePage hPage=new HomePage(driver);
Thread.sleep(5000);
mUtil.tapElement(driver, 1,hPage.getSearchTxtFieldClk(), 500);
hPage.getSearchTxtFieldEnter().sendKeys("winter heater");
mUtil.tapElement(driver, 1, hPage.getFindProdClk(), 500);
mUtil.tapElement(driver, 1, hPage.getProdClk(), 500);
mUtil.tapElement(driver, 1, hPage.getAddToCart(), 500);
mUtil.tapElement(driver, 1, hPage.getSkipPop(), 500);
mUtil.tapElement(driver, 1, hPage.getGoToCart(), 500);
String text = hPage.getCartProd().getText();
System.out.println(text);
}
}

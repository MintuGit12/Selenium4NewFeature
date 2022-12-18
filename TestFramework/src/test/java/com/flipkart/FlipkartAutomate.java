package com.flipkart;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_Utility.BaseClass;
import generic_Utility.MobileDriver_Utility;
import io.appium.java_client.MobileElement;
import object_repository.HomePage;
@Listeners(generic_Utility.ListenerImplementationClass.class)
public class FlipkartAutomate extends BaseClass {
@Test
public void flipkatTest() throws InterruptedException
{
MobileDriver_Utility mUtil=new MobileDriver_Utility();
 MobileElement ser = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Search for products']"));
 mUtil.tapElement(driver,1,ser,500);
 MobileElement prodName = (MobileElement)driver.findElement(By.xpath("//android.widget.EditText[@text='Search for Products, Brands and More']"));
 prodName.sendKeys("winter heater");
 MobileElement clk = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[1][@text='winter heater']"));
 mUtil.tapElement(driver,1,clk,500);
 MobileElement ele = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[1][contains(@text,'Aervinten Fan Heater')]"));
String prod = ele.getText();
System.out.println(prod.length()+".....>>>>"+prod);
//Assert.fail();
mUtil.tapElement(driver,1,ele,500);
MobileElement addCart = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Add to cart']"));

mUtil.tapElement(driver,1,addCart,500);

Thread.sleep(3000);
MobileElement skip= (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));

mUtil.tapElement(driver,1,skip,500);
MobileElement goCart= (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Go to cart']"));

mUtil.tapElement(driver,1,goCart,500);

Thread.sleep(7000);
String res = driver.findElement(By.xpath("//android.widget.TextView[1][contains(@text,'Aervinten Fan Heater ')]")).getText();
System.out.println(res.length()+"...>>>"+res);

Assert.assertEquals(prod.trim(), res.trim());

}
}

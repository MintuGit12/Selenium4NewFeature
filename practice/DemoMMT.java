package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMMT {
static
{
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.makemytrip.com/");
Thread.sleep(8000);
driver.switchTo().frame(2);
	driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	driver.findElement(By.xpath("(//span[contains(@class,'lbl_input latoBold appendBottom10')])[1]")).click();
	driver.findElement(By.xpath("//div[text()='November']/ancestor::div[@class='DayPicker-Months']/descendant::p[text()='15']")).click();
	}

}

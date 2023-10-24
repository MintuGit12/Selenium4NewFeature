import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorSel4 {
	WebDriver driver;
@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://automationbookstore.dev/");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@Test
public void relativeLocator()
{
	WebElement ele = driver.findElement(RelativeLocator.with(By.tagName("li")).toLeftOf(By.id("pid8")).toRightOf(By.id("pid6")).near(By.id("pid3")));
	String text = ele.getAttribute("id");
	System.out.println(text);
}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}

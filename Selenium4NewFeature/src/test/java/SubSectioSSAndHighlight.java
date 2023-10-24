import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubSectioSSAndHighlight {
	WebDriver driver;
@BeforeClass
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.get("https://www.youtube.com/");

}
@Test
public void takeSSAndHighlight() throws IOException
{
	WebElement ele = driver.findElement(By.xpath("//div[@id='scroll-container']"));
	highlightScreenshot(ele, driver);
	File src = ele.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("ssHighlight.png"));
}
public void highlightScreenshot(WebElement ele,WebDriver driver)
{
	JavascriptExecutor ts=(JavascriptExecutor)driver;
	ts.executeScript("arguments[0].style.border='2px solid red'",ele);
}
@AfterClass
public void tear()
{
	driver.quit();
}
}


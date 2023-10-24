import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4Feature {
@Test
public void takesSSOFELE() throws IOException
{
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
WebElement ele = driver.findElement(By.xpath("//img[@alt='Google']"));
File src = ele.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("./logo.png"));
driver.quit();
}
@Test
public void openNewTabAndWindows() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.youtube.com/watch?v=CZVDmDwHnic&list=PLUDwpEzHYYLtW68M8fSawlFvsG0YX82Tx&index=1");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.youtube.com/watch?v=CZVDmDwHnic&list=PLUDwpEzHYYLtW68M8fSawlFvsG0YX82Tx&index=1");
	Thread.sleep(3000);
	driver.quit();
}
@Test
public void getXYAndHeightWidth() 
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.xpath("//img[@alt='Google']"));
	System.out.println(ele.getRect().getDimension().getHeight());
	System.out.println(ele.getRect().getDimension().getWidth());
	System.out.println(ele.getRect().getX());
	System.out.println(ele.getRect().getY());
	driver.quit();
}
}

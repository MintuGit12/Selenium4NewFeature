package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromWebTable {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	}
@Test
public void readData() throws InterruptedException, AWTException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.xpath("//p[@data-cy='departureDay']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).click().perform();
ele.click();
List<WebElement> row1 = driver.findElements(By.xpath("//div[contains(text(),'December 2022')]/ancestor::div[@class='DayPicker-Month']/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']"));
	int row=row1.size();
	List<WebElement> col1 = driver.findElements(By.xpath("//div[contains(text(),'December 2022')]/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Week'][2]/descendant::p"));
	Thread.sleep(3000);
	int col=col1.size();
	System.out.println(row+" 1st "+col);
for(int i=0;i<row;i++)
{
	for(int j=0;j<col;j++)
	{
		System.out.println("1st");
		System.out.print(col1.get(i)+"  one  ");
	}
	System.out.println();
}
//WebElement ele1 = driver.findElement(By.xpath("//div[contains(text(),'December 2022')]/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Week'][1]/descendant::p"));
//System.out.println(ele1.getText());
}
}

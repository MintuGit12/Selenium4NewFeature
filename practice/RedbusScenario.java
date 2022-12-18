package practice;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusScenario {
	
static
{
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source");
		String src = sc.nextLine();
		System.out.println("enter the destination");
		String dest = sc.nextLine();
		System.out.println("enter the month you want to travel");
		String mon = sc.nextLine();
		System.out.println("enter the date");
		String date = sc.nextLine();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//manage()-return Option(i)
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(src);
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']"));
		for(WebElement ele:all)
		{
			if(ele.getText().equals("Kolkata"))
				ele.click();
		}
		driver.findElement(By.id("dest")).sendKeys(dest);
		List<WebElement> all1 = driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']"));
		for(WebElement ele:all1)
		{
			if(ele.getText().equals("Bangalore"))
				ele.click();
		}
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		if(!(mon.contains("december")))
		{
			while(true)
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();
				Thread.sleep(3000);
				String text = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
				System.out.println(text);
				if(text.contains(mon))
				break;
				else
					continue;
			}
			driver.findElement(By.xpath("//td[@class='monthTitle']/../../tr/td[contains(text(),'"+date+"')]")).click();	
		}
		else
		driver.findElement(By.xpath("//td[contains(text(),'Dec 2022')]/../../tr/td[contains(text(),'"+date+"')]")).click();
		driver.findElement(By.xpath("//button[text()='Search Buses']")).sendKeys(Keys.ENTER);
	}

}

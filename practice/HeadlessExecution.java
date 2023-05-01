package Practice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessExecution {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
	}
@Test
public void headlessExe() throws InterruptedException
{
	//HtmlUnitDriver driver=new HtmlUnitDriver();
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
		//ChromeOptions option=new ChromeOptions();
	FirefoxOptions option=new FirefoxOptions();
		option.setHeadless(true);
	//option.addArguments("--headless");
		//WebDriver driver=new ChromeDriver(option);
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test");
		Thread.sleep(3000);
		java.util.List<WebElement> li = driver.findElements(By.xpath("//ul[@role='listbox']"));
		for(WebElement ele:li)
			System.out.println(ele.getText());
		driver.close();
}
}

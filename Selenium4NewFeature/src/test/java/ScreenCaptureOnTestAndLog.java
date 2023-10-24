import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenCaptureOnTestAndLog {
	static WebDriver driver;
public static String capturenormal(WebDriver driver,String name) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./"+name+".png");
	FileUtils.copyFile(src, dest);
	return dest.getAbsolutePath();	
}
public static String captureBase64(WebElement element,String name)
{
	String base64 = element.getScreenshotAs(OutputType.BASE64);
	return base64;
}
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Random r=new Random();
		int i=r.nextInt();
		//Report level Screen Capture
		ExtentReports report=new ExtentReports();
		File f=new File("./reportSS.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(f);
		report.attachReporter(sparkReporter);
		 ExtentTest test1 = report.createTest("CaptureSSNormal using Webdriver");
		 test1.info(MarkupHelper.createLabel("CaptureSSNormal using Webdriver", ExtentColor.RED))
		 .addScreenCaptureFromPath(capturenormal(driver,"normal"+i),"normal driver Screen Capture")
		 .addScreenCaptureFromBase64String(captureBase64(driver.findElement(By.xpath("//img[@alt='Google']")), "base64"+i),"base 64 SS with element");
		 //Attaching Screenshot to the log or log level SS
		 report.createTest("Log level Screen Capture if Failure")
		 .fail(MediaEntityBuilder.createScreenCaptureFromBase64String(captureBase64(driver.findElement(By.xpath("//img[@alt='Google']")),"name"+i)).build());
		 try {
			 driver.findElement(By.xpath("//img[@alt='Googe']"));
			//int i1=10/0;
		} catch (Exception e) {
			report.createTest("Log level Scrren Capture using Normal Driver and failure Exception")
			.fail(e.toString(),MediaEntityBuilder.createScreenCaptureFromPath(capturenormal(driver,"normal"+i),"capture SS using noraml SS and printing the Exception").build());
		}
		 report.createTest("Test1")
		 .assignAuthor("Puru")
		 .assignCategory("SmokeTest")
		 .assignCategory("RegressionTest")
		 .assignDevice("Jasper EMEA")
		 .pass("1st testcase pass", MediaEntityBuilder.createScreenCaptureFromBase64String(captureBase64(driver.findElement(By.xpath("//img[@alt='Google']")),"Just normal Author")).build());
		 try {
			//driver.findElement(By.xpath("//img[@alt='Google']"));
			 int u=100/0;
		} catch (Exception e) {
			 report.createTest("Test2")
			 .assignAuthor(new String[] {"Dhaksh","puru","Sachin"})
			 .assignCategory(new String[] {"SmokeTest","regression Test"})
			 .assignDevice(new String[] {"camera","NA","EMEA"})
			 .fail(e.toString(),MediaEntityBuilder.createScreenCaptureFromPath(capturenormal(driver, "Normal SS using driver"),"using mormal driver").build());
		}
		 try {
				//driver.findElement(By.xpath("//img[@alt='Google']"));
			 int[] in=new int[2];
			 in[1]= 100;
			 in[2]=200;
			 in[3]=789;
			 in[4]=980;
			 in[6]=98;
			} catch (Exception e) {
				 report.createTest("Test3")
				 .assignAuthor("Dhaksh","puru","Sachin")
				 .assignCategory("SmokeTest","Sanity Test")
				 .assignDevice("camera","NA","EMEA")
				 .fail(e.toString(),MediaEntityBuilder.createScreenCaptureFromPath(capturenormal(driver, "Normal SS using driver"),"using mormal driver").build());
			}
		 System.getProperties().list(System.out);
		 driver.quit();
		 report.flush();
		 
	}

}

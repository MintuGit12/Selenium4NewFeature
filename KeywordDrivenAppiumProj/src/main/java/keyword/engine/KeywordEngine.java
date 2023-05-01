package keyword.engine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import keyword.utility.BaseClass;
import keyword.utility.MobileDriver_Utility;

public class KeywordEngine {
	BaseClass base=null;
	MobileDriver_Utility mob=null;
public static Workbook wb;
public static org.apache.poi.ss.usermodel.Sheet sheet;
public AndroidDriver driver;
public Properties prop;
public final String SCENARIO_SHEET_PATH="./src/main/java/keyword/scenario/scenario.xlsx";

public void startExecution(String sheetName,AndroidDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
{
	base=new BaseClass();
	mob=new MobileDriver_Utility();
FileInputStream fis=null;
fis=new FileInputStream(SCENARIO_SHEET_PATH);
wb=WorkbookFactory.create(fis);
sheet=wb.getSheet(sheetName);
for(int i=1;i<sheet.getLastRowNum();i++)
{
	String locName = null;
	String locValue = null;
	WebElement ele=null;
	String val = sheet.getRow(i).getCell(1).getStringCellValue().trim();
	if(!val.equalsIgnoreCase("NA"))
	{
		String[] arr = val.split("=");
		System.out.println(arr.length);
		locName=arr[0].trim();
		System.out.println(locName);
		locValue=arr[1].trim();
		System.out.println(locValue);
//		locName = val.split("=")[0].trim();
//		locValue = val.split("=")[1].trim();
	}
	String action=sheet.getRow(i).getCell(2).getStringCellValue().trim();
	String value=sheet.getRow(i).getCell(3).getStringCellValue().trim();
	switch (locName) {
	case "id":
		ele=driver.findElement(By.id(locValue));
		break;
	default:
		break;
	}
	switch (value) {
	case "continue":
		mob.tapElement(driver,ele);
		Thread.sleep(3000);
		break;
case "coordinate":
		mob.tapElementByCoordinate(driver,878, 1341);
		Thread.sleep(3000);
		break;
case "tapOnView":
	mob.tapElement(driver, ele);
	Thread.sleep(3000);
	break;
case "controls":
mob.tapElement(driver, ele);
Thread.sleep(3000);
	break;
	default:
		break;
	}
}

}
}

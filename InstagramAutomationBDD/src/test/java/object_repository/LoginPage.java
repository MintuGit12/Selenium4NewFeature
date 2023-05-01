package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
@FindBy(xpath ="//input[@id='Username']")
private WebElement username;
@FindBy(xpath ="//input[@id='Password']")
private WebElement password;
@FindBy(xpath ="//input[@value='Log in']")
private WebElement loginBtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void login(String un,String pass)
{
	username.sendKeys(un);
	password.sendKeys(pass);
	loginBtn.click();
	
}
}

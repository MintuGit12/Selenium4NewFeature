package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="Username")
@CacheLookup
private WebElement usernameTxtField;

@FindBy(id="Password")
@CacheLookup
private WebElement passTxtField;

@FindBy(xpath = "//input[@value='Log in']")
@CacheLookup
private WebElement loginBtn;
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getUsernameTxtField() {
	return usernameTxtField;
}

public void setUsernameTxtField(WebElement usernameTxtField) {
	this.usernameTxtField = usernameTxtField;
}

public WebElement getPassTxtField() {
	return passTxtField;
}

public void setPassTxtField(WebElement passTxtField) {
	this.passTxtField = passTxtField;
}
public void loginPage(String un,String pwd)
{
	usernameTxtField.sendKeys(un);
	passTxtField.sendKeys(pwd);
	loginBtn.click();
}
}

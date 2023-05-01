package stepsDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.LoginPage;

public class LoginSteps {
	public   WebDriver driver;
static
{
	System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
}
@Before
@Given("user launch Chrome browser")
public void user_launch_Chrome_browser() {
	System.out.println("browser setup.........................");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().window().maximize();
}

@When("user open url {string}")
public void user_open_url(String string) {
 driver.get("https://www.nopcommerce.com/en/login"); 
}

@When("^user enters (.*) and (.*)$")
public void user_enters_Email_as_and_password_as(String email, String password) {
//	driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(email);
//	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
//	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	LoginPage log=new LoginPage(driver);
	log.login(email, password);
	
   System.out.println("hii program is running fine");
}

@When("click on Login")
public void click_on_Login() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	// driver.close();
}

@Then("Page title should be {string}")
public void page_title_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user click on Logout link")
public void user_click_on_Logout_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("page title should be {string}")
public void page_title_should_bee(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("close browser")
public void close_browser() {
	System.out.println("exit from browser.................");
    driver.close();
}
@After
public void close_browser1() {
	System.out.println("exit from browser.................");
    driver.close();
}
}

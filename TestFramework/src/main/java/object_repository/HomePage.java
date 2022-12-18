package object_repository;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumExecutionMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

@AndroidFindBy(xpath="//android.widget.TextView[@text='Search for products']")
private MobileElement searchTxtFieldClk;

@AndroidFindBy(xpath="//android.widget.EditText[@text='Search for Products, Brands and More']")
private MobileElement searchTxtFieldEnter;

@AndroidFindBy(xpath="//android.widget.TextView[1][@text='winter heater']")
private MobileElement findProdClk;

@AndroidFindBy(xpath="//android.widget.TextView[1][contains(@text,'Aervinten Fan Heater')]")
private MobileElement prodClk;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Add to cart']")
private MobileElement addToCart;

@AndroidFindBy(xpath="//android.widget.TextView[@text='SKIP']")
private MobileElement skipPop;

@AndroidFindBy(xpath="//android.widget.TextView[@text='Go to cart']")
private MobileElement goToCart;

@AndroidFindBy(xpath="//android.widget.TextView[1][contains(@text,'Aervinten Fan Heater ')]")
private MobileElement cartProd;

public HomePage(AppiumDriver driver)
{
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

public MobileElement getSearchTxtFieldClk() {
	return searchTxtFieldClk;
}

public MobileElement getSearchTxtFieldEnter() {
	return searchTxtFieldEnter;
}

public MobileElement getFindProdClk() {
	return findProdClk;
}

public MobileElement getProdClk() {
	return prodClk;
}

public MobileElement getAddToCart() {
	return addToCart;
}

public MobileElement getSkipPop() {
	return skipPop;
}

public MobileElement getGoToCart() {
	return goToCart;
}

public MobileElement getCartProd() {
	return cartProd;
}
}

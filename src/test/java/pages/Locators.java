package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.Hooks;

public class Locators extends Hooks{
	WebDriver driver = null;
	
	//Remember to always initialize driver and execute initElements methos in class's constructor
	public Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Locators.class);
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	//For making work this kind of Configuration, next Selenium-java version is being used: 4.0.0-alpha-5
	@FindBy(id= "name")
	WebElement userName;
	
	@FindBy(id= "password")
	WebElement password;
	
	@FindBy(id= "login")
	WebElement logInButton;
	
	@FindBy(id= "logout")
	WebElement logOutButton;
	
	@FindBy(id= "save")
	WebElement saveButton;
	
	public void enterData(WebElement el, String user) {
		WebElement element = el;
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(user);
	}
	
	public void clickOnWebElement(WebElement el) {
		WebElement element =  el;
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public WebElement elementDisplayed(WebElement el) {
		WebElement element =  el;
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
}

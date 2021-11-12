package pages;

import org.openqa.selenium.WebDriver;

public class TestMethods extends Locators{
	public TestMethods(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Locators loc = new Locators(driver);
	
	public void enterUserName(String user) {
		loc.enterData(userName, user);
	}
	
	public void enterPassword(String pswd) {
		loc.enterData(password, pswd);
	}
	
	public void clickOnLogInButton() {
		loc.clickOnWebElement(logInButton);
	}
	
	public void validateLogOutBtnIsDisplayed() {
		loc.elementDisplayed(logOutButton);
	}
	
	public void validateSaveBtnIsDisplayed() {
		loc.elementDisplayed(saveButton);
	}
}

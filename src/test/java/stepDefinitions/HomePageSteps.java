package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TestMethods;

public class HomePageSteps extends Hooks{
	WebDriver driver = setup("chrome");
	TestMethods tm = new TestMethods(driver);

	@Given("I enter user name")
	public void i_enter_user_name() {
		tm.enterUserName("Christian");
	}

	@And("I enter password")
	public void i_enter_password() {
	    tm.enterPassword("12345");
	}

	@And("I click on Login button")
	public void i_click_on_Login_button() {
	    tm.clickOnLogInButton();
	}

	@Then("I am able to see logout button")
	public void i_am_able_to_see_logout_button() {
	    tm.validateLogOutBtnIsDisplayed();
	}

	@Then("I am able to see save button")
	public void i_am_able_to_see_save_button() {
	    tm.validateSaveBtnIsDisplayed();
	}
}

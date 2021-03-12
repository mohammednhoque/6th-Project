package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("browse web application")
	public void browse_web_application() {
	 System.out.println("browser open");
	}

	@When("put username and password")
	public void put_username_and_password() {
	  System.out.println("enter user and password");
	}

	@And("click on Login button")
	public void click_on_Login_button() {
	   System.out.println("login");
	}

	@Then("enter in the home page")
	public void enter_in_the_home_page() {
	    System.out.println("enter in homepage");
	}

	
}

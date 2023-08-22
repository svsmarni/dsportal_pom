package stepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page");
	}

}

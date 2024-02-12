package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Hello");
	}
	
	@When("user enter username and password")
	public void entercredentials() {
		System.out.println("Hi");
	}
	
	@When("user click on login button")
	public void click_on_login_button() {
		System.out.println("Bye");
	}
	
	@Then("user succesfully login")
	public void loginsuccessfull() {
		System.out.println("Tata");
	}
	
}

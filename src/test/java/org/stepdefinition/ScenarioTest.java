package org.stepdefinition;

import org.base.BaseClass;

import Pojo.FbLoginPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioTest extends BaseClass{
	
	FbLoginPojo f;
	
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("user has to hit the facebook Url")
	public void user_has_to_hit_the_facebook_Url() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String e) {
		f = new FbLoginPojo();
		passText(e, f.getEmail());
	}

	@When("user has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String p) {
		f = new FbLoginPojo();
		passText(p, f.getPassWrd());
	}

	@When("User has to click the Login button")
	public void user_has_to_click_the_Login_button() {
		f= new FbLoginPojo();
		clickBtn(f.getLogBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}

}

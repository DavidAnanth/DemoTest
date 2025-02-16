package org.stepdefinition;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.base.BaseClass;

import Pojo.FbLoginPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass{
	
	FbLoginPojo f;
	
	@Given("To Launch the chrome browser and maximize the window")
	public void to_Launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the facebook Url")
	public void to_launch_the_facebook_Url() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass the vallid username in the email field")
	public void to_pass_the_vallid_username_in_the_email_field() {
		f = new FbLoginPojo();
		passText("8754149249", f.getEmail());
	}

	@When("To pass the invalid password in the password field")
	public void to_pass_the_invalid_password_in_the_password_field() {
		f= new FbLoginPojo();
		passText("Tony@2408", f.getPassWrd());
	}

	@When("To pass click the login button")
	public void to_pass_click_the_login_button() {
		f= new FbLoginPojo();
		clickBtn(f.getLogBtn());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("To check the login credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}

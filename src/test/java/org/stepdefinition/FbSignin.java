package org.stepdefinition;

import org.base.BaseClass;

import Pojo.FbSignInPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignin extends BaseClass{
	
	FbSignInPojo f;

	@Given("To launch the browser and maximize the windows")
	public void to_launch_the_browser_and_maximize_the_windows() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To Launch Url of the Fb Application")
	public void to_Launch_Url_of_the_Fb_Application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click Create new Account button")
	public void to_click_Create_new_Account_button() {
	    f = new FbSignInPojo();
	    clickBtn(f.getCrtAcctBtn());
	}

	@When("To pass the first name in the Firstname field")
	public void to_pass_the_first_name_in_the_Firstname_field() throws InterruptedException {
		Thread.sleep(2000);
		f = new FbSignInPojo();
		passText("Donald", f.getfName());
	}

	@When("To pass the second name in the Secondname field")
	public void to_pass_the_second_name_in_the_Secondname_field() {
		f = new FbSignInPojo();
		passText("Trumph", f.getlName());
	}

	@When("To pass the MobileNo or Email in the Email\\/Mobileno field")
	public void to_pass_the_MobileNo_or_Email_in_the_Email_Mobileno_field() {
		f = new FbSignInPojo();
		passText("9876543210", f.getMailOrMob());
	}

	@When("To create new password using the new password field")
	public void to_create_new_password_using_the_new_password_field() {
		f = new FbSignInPojo();
		passText("Tony@2408", f.getNewPwd());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    closeEntireBrowser();
	}

	
	}

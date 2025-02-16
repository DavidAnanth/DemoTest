package Pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	public FbLoginPojo() {
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBys({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(xpath="//input[@name='pass']"),
		@FindBy(xpath="//input[@data-testid='royal_pass']")
	})
	private WebElement passWrd;
	
	@FindAll({
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@data-testid='royal_login_button']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement logBtn;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassWrd() {
		return passWrd;
	}

	public WebElement getLogBtn() {
		return logBtn;
	}

}

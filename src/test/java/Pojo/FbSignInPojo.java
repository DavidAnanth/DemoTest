package Pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignInPojo extends BaseClass{
	
	public FbSignInPojo() {
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CrtAcctBtn;
	
	public WebElement getCrtAcctBtn() {
		return CrtAcctBtn;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getMailOrMob() {
		return mailOrMob;
	}

	public WebElement getNewPwd() {
		return newPwd;
	}

	@FindBy(name = "firstname")
	private WebElement fName;
	
	@FindBy(name = "lastname")
	private WebElement lName;
	
	@FindBy(name = "reg_email__")
	private WebElement mailOrMob;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newPwd;
	


}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobject {
	public loginpageobject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="UserName")
	public WebElement txtUserid;
	
	@FindBy(id="Password")
	public WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	public WebElement Loginbtn;
	
	/*
	 * @FindBy(id="UserName") public WebElement Resetbtn;
	 */



	

}

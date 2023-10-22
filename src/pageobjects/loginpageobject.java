package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageobject {
	public loginpageobject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElement txtUserid;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='LOG IN']")
	public WebElement Loginbtn;
	
	/*
	 * @FindBy(id="UserName") public WebElement Resetbtn;
	 */



	

}

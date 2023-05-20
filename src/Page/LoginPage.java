package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
private WebDriver driver;
    
    @FindBy(id = "UserName")
    private WebElement usernameInput;
    
    @FindBy(id = "Password")
    private WebElement passwordInput;
    
    @FindBy(id = "btnLogin")
    private WebElement loginButton;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterUsername(String UserName) {
        usernameInput.sendKeys(UserName);
    }
    
    public void enterPassword(String Password) {
        passwordInput.sendKeys(Password);
    }
    
    public void clickLoginButton() {
        loginButton.click();
    }

}

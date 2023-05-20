package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
private WebDriver driver;
    
    @FindBy(id = "welcomeMessage")
    private WebElement welcomeMessage;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

}

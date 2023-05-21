package executetestcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageobjects.loginpageobject;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
        // Launch the browser

        driver.get("https://magnus.jalatechnologies.com/");
        loginpageobject login= new loginpageobject(driver);
        login.txtUserid.sendKeys("training@jalaacademy.com");
        login.txtPassword.sendKeys("jobprogram");
        login.Loginbtn.click();
        
        

	}

}

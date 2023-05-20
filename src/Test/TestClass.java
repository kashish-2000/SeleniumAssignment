package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.LoginPage;

public class TestClass {
private WebDriver driver;
    
    @BeforeClass
    public void setUp() {
        // Initialize WebDriver and open the application
        driver = new ChromeDriver();
        driver.get("http://magnus.jalatechnologies.com/");
    }
    
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver
        driver.quit();
    }
    
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        
        // Perform login actions
        loginPage.enterUsername("training@jalaacademy.com");
        loginPage.enterPassword("jobprogram");
        loginPage.clickLoginButton();

}
}

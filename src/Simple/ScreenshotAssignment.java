package Simple;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

@Test
public class ScreenshotAssignment {
	WebDriver driver;
	
    public void screenShot() throws IOException {
    	Date crntdate = new Date();
        String clip = crntdate.toString().replace(" ", "-").replace(":", "-");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        //creating an object of File class to store the screenshot and adding casting
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //saving the screenshot as png format in a folder
        FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ clip +".png"));
        driver.quit();
    }

}

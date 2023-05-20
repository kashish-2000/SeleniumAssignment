package Simple;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandleCookie {
	 WebDriver driver;

	    @Test(priority = 0)
	    public void launch() throws InterruptedException {
	        ChromeOptions option = new ChromeOptions();
	        option.addArguments("--remote-allow-origins=*");
	        driver = new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.get("http://magnus.jalatechnologies.com/");
	        Thread.sleep(1000);
	    }
	    @Test(priority = 1)
	    public void initilize() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	        Thread.sleep(1000);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        Set<Cookie> cookiesList =  driver.manage().getCookies();
	        for(Cookie getcookies :cookiesList) {
	            System.out.println(getcookies);
	        }
	    }
	   
	 


}

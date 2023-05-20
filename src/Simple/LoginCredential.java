package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginCredential {
	 WebDriver driver;

  @Test(priority = 0)
  public void f() throws InterruptedException {
	  ChromeOptions option = new ChromeOptions();
      option.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(option);
      driver.manage().window().maximize();
      driver.get("http://magnus.jalatechnologies.com/");
      Thread.sleep(1000);
    //div[@class='toast-title']
  }
  @Test(priority = 1)
  public void ValidLogin() throws InterruptedException {
      driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com"); // 1st Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram"); // 2nd Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id='btnLogin']")).click(); // 3rd Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click(); // 4th Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//a[normalize-space()='Search']")).click(); // 5th Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("vanll"); // 6th Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id='btnSearch']")).click(); // 7th Automation
		Thread.sleep(1000);


  }
  @Test(priority = 2)
  public void InvalidLogin() throws InterruptedException {
      driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com"); // 1st Automation
		Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("kashish"); // 2nd Automation
			Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id='btnLogin']")).click(); // 3rd Automation
			Thread.sleep(1000);
      driver.findElement(By.xpath("div[@class='toast-title']")).getText();
      Thread.sleep(1000);
      driver.quit(); 
		
  }
}

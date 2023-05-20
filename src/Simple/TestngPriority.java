package Simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestngPriority {
    WebDriver driver;
    @Test(priority = 2)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle p-22']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
    @Test(priority = 1)
    public void initilize() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
    }


}

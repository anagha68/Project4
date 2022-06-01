package packageselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto9 
{public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
//	WebElement UserName =driver.findElement(By.id("user-name"));
//	UserName.sendKeys("problem_user");
//	Thread.sleep(2000);
//	WebElement Password =driver.findElement(By.name("password"));
//	Password.sendKeys("secret_sauce");
//	Thread.sleep(2000);
//	WebElement LogIn =driver.findElement(By.id("login-button"));
//	LogIn.click();
//	Thread.sleep(2000);
	WebElement Username=driver .findElement(By.xpath("//input[@id='user-name']"));
	Username.sendKeys("problem_user");
	WebElement Password=driver .findElement(By.xpath("//input[@name='password']"));
	Password.sendKeys("problem_user");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

}

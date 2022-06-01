package packageselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto8 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
//	driver.get("https://www.saucedemo.com/");
//	Thread.sleep(2000);
//	WebElement UserName =driver.findElement(By.id("user-name"));
//	UserName.sendKeys("problem_user");
//	Thread.sleep(2000);
//	WebElement Password =driver.findElement(By.name("password"));
//	Password.sendKeys("secret_sauce");
//	Thread.sleep(2000);
//	WebElement LogIn =driver.findElement(By.id("login-button"));
//	LogIn.click();
//	Thread.sleep(2000);
driver.get("https://www.instagram.com/?hl=en");
Thread.sleep(5000);
WebElement UserName =driver.findElement(By.name("username"));
UserName.sendKeys("problem_user");
Thread.sleep(2000);
WebElement Password =driver.findElement(By.name("password"));
Password.sendKeys("secret_sauce");
Thread.sleep(2000);
WebElement LogIn =driver.findElement(By.id("loginForm"));
LogIn.click();
//Thread.sleep(2000);
//WebElement ForgotPassword =driver.findElement(By.linkText("Forgot password?"));
//ForgotPassword.click();
//WebElement forgotPassword = driver.findElement(By.partialLinkText("t"));
//	forgotPassword.click();
//	

	
	
	
	
	
	
	
}
}

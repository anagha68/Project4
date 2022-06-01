package packageselnium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
  
public class Auto13 
{
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	WebElement Username=driver.findElement(By.xpath("//input[@id='user-name']"));
	Username.sendKeys("standard_user");
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("secret_sauce");
	WebElement LogInButton=driver.findElement(By.xpath("//input[@id='login-button']"));
	LogInButton.click();   
	TakesScreenshot ts=(TakesScreenshot)driver;
	File SourceFile=ts.getScreenshotAs(OutputType.FILE);
	File DestinationFile=new File("C:\\Users\\USER\\Downloads\\automation\\SS\\SaucedemoLogin.jpg");
	FileHandler.copy(SourceFile, DestinationFile);
	System.out.println("ScreenShot is Taken");
	WebElement Backpack=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	Backpack.click();
	WebElement AddToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	AddToCart.click();

	File SourceFile1=ts.getScreenshotAs(OutputType.FILE);
	File DestinationFile1=new File("C:\\Users\\USER\\Downloads\\automation\\SS\\cart.jpg");
	FileHandler.copy(SourceFile1, DestinationFile1 );
	System.out.println("ScreenShot is Taken");
	//driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

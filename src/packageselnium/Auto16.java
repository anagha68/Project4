package packageselnium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Auto16 
{
	static WebDriver driver;
	public static void method() throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String date = d1.format(d);
		
		//screenshot
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\USER\\Downloads\\automation\\SS\\"+date+".jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("login screenshot is taken");
		//"C:\Users\USER\Downloads\automation\SS"

	}
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	
	  driver=new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		//Username.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		WebElement LogInButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		LogInButton.click(); 
	method();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
}

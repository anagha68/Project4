package packageselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto11 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement UserName =driver.findElement(By.xpath(""));
		UserName.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement Password =driver.findElement(By.xpath(""));
		Password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement LogIn =driver.findElement(By.xpath(""));
		LogIn.click();
		Thread.sleep(2000);
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

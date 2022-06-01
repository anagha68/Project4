package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDrives {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
	 	
 		driver.manage().window().maximize();
 		driver.get("https://www.saucedemo.com/");
 		Thread.sleep(2000);
 		
 		//username element
 		
 		WebElement userName = driver.findElement(By.id("user-name"));
 		userName.sendKeys("standard_user");
 		Thread.sleep(2000);
 		
 		//password 
 		WebElement password = driver.findElement(By.id("password"));
 		password.sendKeys("secret_sauce");
Thread.sleep(2000);
 		
 		//loginButton
 		
 		WebElement loginButton = driver.findElement(By.id("login-button"));
 		loginButton.click();
 		
 		//test case-1
 		String expectedTitle = "Swag Labs";
 		
 		String actaulTitle =driver.getTitle();
 		
// 		if(expectedTitle.equals(actaulTitle))
// 		{
// 			System.out.println("user is successfully able to login and hence test case is passed");
// 		}
// 		else
// 		{
// 			System.out.println("test case is failed");
// 		}
// 		
// 		//test case-2
// 		
// 		String expectedURL = "https://www.saucedemo.com/inventory.html";
// 		String actualURL = driver.getCurrentUrl();
//
// 		if(expectedURL.equals(actualURL))
// 		{
// 			System.out.println("TC is passed");
// 		}
// 		else
// 		{
// 			System.out.println("TC is failed");
// 		}
 
 		
 
 		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

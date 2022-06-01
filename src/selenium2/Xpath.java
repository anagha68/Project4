package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	 	
 		driver.manage().window().maximize();
 		driver.get("https://www.facebook.com/");
 		Thread.sleep(2000);
 		WebElement userName = driver.findElement(By.xpath("//input[contains(@id, 'il')]"));
		userName.sendKeys("Admin");
		Thread.sleep(3000);
		
		//password
		WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'pa')]"));
		password.sendKeys("Admin");
		Thread.sleep(3000);
		
		//conatins -by text
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Lo')]"));
		loginButton.click();
		
		

 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}

}

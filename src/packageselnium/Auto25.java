package packageselnium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto25 {
	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		//	driver.findElement(By.linkText("Mobiles")).click();
			List<WebElement>links =driver.findElements(By.tagName("a"));
			int n=links.size(),count=0;
	
		
		

		
		
		
		
	}

}

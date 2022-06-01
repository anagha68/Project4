package packageselnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Auto2 
{

	public static void main(String[] args) //throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	//Thread.sleep(2000);
	//Thread.sleep(2000);  
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	//Thread.sleep(3000);
	//driver.manage().window().minimize();
	String actualURL = driver.getCurrentUrl();
	String expectedURL="https://www.google.com/";
	if(actualURL.equals(expectedURL))
	{
	   System.out.println("TC is passed for URL");
	}
	else
	{
		System.out.println("TC is failed for URL");
	}
	
	
	
	
	
	
	
	driver.close();

	
	
	
	
	
	
	
	
	}

}

package packageselnium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto12 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement radio1=driver.findElement(By.xpath("//input[@value='Radio4']"));
//		radio1.click();
		boolean result=radio1.isSelected();
		System.out.println("Before clicking - "+result);
		if(result==true)
		{
			System.out.println("Button is already selected");
		}
		else
		{
			System.out.println("button will be selected now");
			radio1.click();
		}
		boolean result1=radio1.isSelected();
		System.out.println("now button is selected");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

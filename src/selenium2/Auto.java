
package selenium2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//set size for browser
			Dimension d = new Dimension(500, 500);
			
			driver.manage().window().setSize(d);
			
			Point p = new Point(500,100);
			driver.manage().window().setPosition(p);

		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

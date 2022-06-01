package packageselnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto19 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(10000,0)");
			WebElement a=driver.findElement(By.xpath("(//span[@class='gw-icon feed-arrow'])[2]"));
			Actions act=new Actions(driver);
			act.click(a).perform();
			Thread.sleep(5000);
			act.click(a).perform();
			Thread.sleep(5000);
			act.click(a).perform();
			Thread.sleep(5000);
			act.click(a).perform();
 

			
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(10000,0)");
//			Thread.sleep(4000);
//			js.executeScript("window.scrollBy(-5000,0)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

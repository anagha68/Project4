package packageselnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Auto20 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://text-compare.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			WebElement area1=driver.findElement(By.xpath("//textarea[@name='text1']"));
			area1.sendKeys("I love my india");
			Actions act=new Actions(driver);
			act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
			WebElement area2=driver.findElement(By.xpath("//textarea[@name='text2']"));
			area2.click();
			act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
			WebElement compare=driver.findElement(By.xpath("//button[@id='compareButton']"));
			compare.click();
			WebElement message=driver.findElement(By.xpath("//span[@class='messageForUser']"));
			String str=message.getText();
		System.out.println(str);
			String actual="The two texts are identical!";
		
			if(str.equals(actual))
			{
			System.out.println("Test case is passed");	
			}
			else
			 {
				System.out.println("Test case is Failed");	
			 }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
package packageselnium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto22 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",  "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));  
	Thread.sleep(4000);
	WebElement Confirmbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	Confirmbutton.click();
	Thread.sleep(4000);
    Alert alt=	driver.switchTo().alert();
    System.out.println(alt.getText());
    Thread.sleep(4000);
	alt.dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

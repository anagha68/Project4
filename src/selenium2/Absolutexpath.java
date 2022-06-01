package selenium2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Absolutexpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
 	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createacc = driver.findElement(By.xpath("(//html//a)[5]"));
		createacc.click();
	Thread.sleep(3000);
	
	//password                
//	WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'pa')]"));
//	password.sendKeys("Admin");
//	Thread.sleep(3000);
//	
//	//conatins -by text
//	WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Lo')]"));
//	loginButton.click();
//	
	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
	//day.click();
	List<WebElement> mnth=driver.findElements(By.xpath("//select[@id='month']"));
	Actions act=new Actions(driver);
	act.click().perform();
	
	Select s=new Select(day);
	s.selectByValue("2");
	
	Select s1=new Select (mnth);
//	for(int i=0;i<12;i++)
//	{
//		s1.selectByIndex(i);
//		
//		Thread.sleep(2000);
//	}
//	List<WebElement> str=new ArrayList (s1.getAllSelectedOptions());
	System.out.println(str.size());
	
	
	
	
	
	
	
	
	
	
}
}

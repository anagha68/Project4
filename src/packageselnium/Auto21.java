package packageselnium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto21
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",  "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	WebElement CreateACC =driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	CreateACC.click();
	Thread.sleep(3000);
	WebElement Firstname =driver.findElement(By.xpath("//input[@name='firstname']"));
	Firstname.sendKeys("ana");
	Thread.sleep(3000);
	WebElement LastName =driver.findElement(By.xpath("//input[@name='lastname']"));
	LastName.sendKeys("ANA");
	Thread.sleep(3000);
	WebElement Emailid =driver.findElement(By.xpath("//input[@name='reg_email__']"));
	Emailid.sendKeys("Anaa");
	Thread.sleep(3000);
	WebElement Password =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	Password.sendKeys("Anaa");
	Thread.sleep(3000);
	WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
	day.sendKeys("4");
	//select[@title='Month']
	Thread.sleep(3000);
	WebElement month =driver.findElement(By.xpath("//select[@title='Month']"));
	month.sendKeys("jun");
	Thread.sleep(3000);
	WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	year.sendKeys("2000");
	Thread.sleep(3000);
	WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	signup.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

package packageselnium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto5 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	Dimension d=new Dimension(100,500);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p=new Point(100,100);
	driver.manage().window().setPosition(p);
	driver.close();
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
	
	
	
	
}
}

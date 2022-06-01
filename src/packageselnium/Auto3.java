package packageselnium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto3
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String expectedURL ="https://www.google.com/";
	String actualURL=driver.getCurrentUrl();
	System.out.println(expectedURL);
	System.out.println(actualURL);
	if(expectedURL.equals(actualURL))
	{
		System.out.println("TC is pass");
		
	}
	else
	{
		System.out.println("TC is Fail");
	}
	driver.manage().window().maximize();
	String actualTitle=driver.getTitle();
	String expectedTitle="Google";
	if (expectedTitle.equals(expectedTitle))
	{
		System.out.println("TC is pass for Title");
		
	}
	else
	{
		System.out.println("tc is fail for Title");
	}
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.quit();
	
	
	
	
	
	}

}

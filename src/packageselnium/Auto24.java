package packageselnium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto24 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	//	driver.findElement(By.linkText("Mobiles")).click();
		List<WebElement>links =driver.findElements(By.tagName("a"));
		int n=links.size(),count=0;
		System.out.println("no. of links:-"+n);
//		for(int i=0;i<=links.size();i++)
//		{
//			System.out.println(links.get(i).getAttribute("href"));
//			System.out.println(links.get(i).getText());
//		}
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if (url.isEmpty())
			{
				System.out.println("url is empty");
			}
			URL link=new URL(url);
		
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			httpconn.connect();
			if(httpconn.getResponseCode()>=400)
			{
				System.out.println(httpconn.getResponseCode()+"-is a broken link");
				count++;
			}
			else
			{
				System.out.println(httpconn.getResponseCode()+"-is a valid link");
			}
			
			
		}
		
		System.out.println("no.of broken links:-"+count);
	
		Thread.sleep(4000);
		driver.quit();
		
	}

}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Drivermngr {
	public static WebDriver driver; //creating instance of webdriver
	public static void getDriver(String type, String url) {
		
		String path = "C:\\Users\\namit\\Projects\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//String path = "C:\\Users\\namit\\Downloads\\geckodriver-v0.27.0-win64";
		//System.setProperty("webdriver.firefox.driver", path);
		
		
		if (type.equalsIgnoreCase("chrome")) 
		{
			
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) 
		{		
			
			driver = new FirefoxDriver();
			
		} 
		
		else {
			Assert.assertTrue(false, "No correct type sent");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("Navigated to Browser"+ type + url, true);
		//return driver;	
	}
}

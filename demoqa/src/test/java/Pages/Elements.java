package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elements extends mainTest.MainTest {
	
	public void WebTable()
		
	{
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(".category-cards > div > div > div:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("#item-3 .text")).click();
		for(int i=2; i<=6; i++)
		{
			WebElement head = driver.findElement(By.cssSelector(".rt-thead .rt-tr > div:nth-of-type(" + i  + ")"));
			WebElement row1 = driver.findElement(By.cssSelector(".rt-tbody > div > div > div:nth-of-type(" + i +")"));
			WebElement row2 = driver.findElement(By.cssSelector(".rt-tbody > div:nth-of-type(2) > div > div:nth-of-type("+ i + ")"));
			WebElement row3 = driver.findElement(By.cssSelector(".rt-tbody > div:nth-of-type(3) > div > div:nth-of-type("+ i + ")"));
			
			System.out.println(head);
			System.out.println(row1);
			System.out.println(row2);
			System.out.println(row3);
		}
		
	}

}

package mainTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.Elements;
import utils.Drivermngr;

public class MainTest extends utils.Drivermngr {

	String url = "";
	//public WebDriver driver = null;

	@Parameters({ "browser", "url" })
	@Test
	public void search_item(String browser, String url) {

		Drivermngr.getDriver(browser, url);
		
		/// Elements obj = PageFactory.initElements (driver, Elements.class);

		Elements obj = new Elements();
		obj.WebTable();

	}

}

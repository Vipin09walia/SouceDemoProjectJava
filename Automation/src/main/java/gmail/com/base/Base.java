package gmail.com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	protected WebDriver driver ;
	@BeforeMethod
	protected void setup()
	{ 
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//System.out.println("Launch Facebook succesfully");
	}
	
	@AfterMethod
	protected void teardown()
	{ 
		driver.quit();
	}
	

}
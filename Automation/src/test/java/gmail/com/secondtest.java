package gmail.com;

import org.testng.annotations.Test;

import gmail.com.base.Base;


public class secondtest extends Base {
	
	@Test
	public void Case2()
	{
		driver.get("https://www.facebook.com");
		System.out.println("Launch Facebook succesfully");
	}


}

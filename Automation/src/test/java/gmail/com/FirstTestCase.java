package gmail.com;

import org.testng.annotations.Test;

import gmail.com.base.Base;

public class FirstTestCase extends Base
{ 	 
	@Test
	public void Case1()
	{
		driver.get("https://www.google.com");
		System.out.println("Launch succesfully");
	}

}

package sampletestcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {
@Test
	public void verifyloginwithValidCredentials()
	{
		
	System.out.println("Test starting.....");
	System.out.println("verifyloginwithValidCredentials");
	Assert.assertTrue(true);
	System.out.println("Test Ended.....");
	}
@Test
public void verifyloginwithInvalidCredentials()
{
System.out.println("Test starting......");
System.out.println("verifyloginwithInvalidCredentials");
Assert.assertTrue(true);
	System.out.println("Test Ended.....");
}
@Test
public void verifyloginwithNoCredentials()
{
	System.out.println("Test starting");
	System.out.println("verifyloginwithNoCredentials");
	Assert.assertTrue(true);
	System.out.println("Test Ended.....");
}
}

package testPackage;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_LoginPage extends BaseClass
{
	@Test
	void loginPage_withValidCredential() throws InterruptedException
	{
		pom.LoginPage lgn = new pom.LoginPage(driver);
		test = report.createTest("Verify login with valid credentials").assignCategory("Login").assignAuthor("Pratik").assignDevice("Window");
		Thread.sleep(2000);
		lgn.loginWithValidCredential();	
		
//		Assert.fail();
	}
	

}

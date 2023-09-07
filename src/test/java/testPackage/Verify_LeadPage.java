package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_LeadPage extends testPackage.BaseClass
{
	@Test
	void createLead() throws InterruptedException
	{
		pom.Add_LeadPage al = new pom.Add_LeadPage(driver);
		test = report.createTest("Verify weather interested lead is created or not").assignCategory("Lead").assignAuthor("Pratik");
		Thread.sleep(1000);
		al.createLead_Interested();	
		Assert.fail();
	}
}

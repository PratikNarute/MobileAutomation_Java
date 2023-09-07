package pom;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import utility.PerformActions;


public class LoginPage {
   AndroidDriver driver;
   SoftAssert sa;
   
	
	@FindBy (xpath = "//android.view.View[@content-desc=\"Get Started\"]") WebElement letStarted_Button;
	@FindBy (xpath = "//android.widget.EditText[@hint='Enter your email']") WebElement email_Input;
	@FindBy (xpath = "//android.widget.EditText[@hint='Enter your password']") WebElement pass_Input;
	@FindBy (xpath = "//android.view.View[@content-desc='Login']") WebElement login_Button;
	@FindBy (xpath = "//android.view.View[@bounds='[220,1239][1220,1437]']")WebElement call_Funnel;
	@FindBy (xpath = "//android.widget.Button[@bounds='[622,2770][818,2900]']")WebElement addLead_Button;
	@FindBy (xpath = "//android.view.View[@content-desc=\"Active Leads\"]")WebElement activeLead_icon;
	@FindBy (xpath = "//android.widget.Button[@content-desc=\"All project\"]")WebElement project_Dropdown;
	@FindBy (xpath = "//android.view.View[@content-desc=\"Active Leads\"]")WebElement activeLead_BoxButton;
	@FindBy (xpath = "//android.view.View[@content-desc=\"Uncalled Leads\"]")WebElement uncalledLead_BoxButton;
	@FindBy (xpath = "//android.view.View//android.view.View[@index='1']")WebElement leadCount_Text;
	
	


	public LoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
		sa = new SoftAssert();
	    
	}
	
	public void loginWithValidCredential() throws InterruptedException
	{
		Logger log = (Logger) LogManager.getLogger(LoginPage.class);
		PerformActions.clickAction(driver, letStarted_Button);
		log.info("Click on letStarted button successfuly");
		PerformActions.clickAction(driver, email_Input);
		PerformActions.sendkAction(driver, email_Input, "amit@kolonizer.com");
		PerformActions.clickAction(driver, pass_Input);
		PerformActions.sendkAction(driver, pass_Input, "123");
		PerformActions.clickAction(driver, login_Button);
	    Thread.sleep(2000);
	    
	    String actual=project_Dropdown.getAttribute("content-desc");
	    sa.assertEquals(actual, "All project");
	    sa.assertAll();
	}
}

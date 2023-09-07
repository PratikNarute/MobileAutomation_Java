package pom;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utility.PerformActions;
import utility.RandomClass;


public class Add_LeadPage 
{
	AndroidDriver driver;
	List <WebElement> list;
	
	@FindBy (xpath ="//android.widget.Button[@bounds='[622,2770][818,2900]']") WebElement addLead_IconButton;
	@FindBy (xpath ="//android.widget.Button[@content-desc='Select Project']") WebElement project_Dropdown;
	@FindBy (xpath ="//android.widget.Button[@content-desc=\"Select Project\"]/parent :: android.widget.ScrollView//android.view.View//android.widget.Button") WebElement projectAllList;;
	@FindBy (xpath ="//android.view.View[@content-desc='self(Logged In)']/android.widget.RadioButton") WebElement selfAssigned;
	@FindBy (xpath ="//android.view.View/android.widget.RadioButton") WebElement allAssignedOptons;
	@FindBy (xpath ="//android.view.View[@bounds='[100,776][1340,944]']") WebElement assignedUser_Input;
	@FindBy (xpath ="//android.widget.Button[@content-desc='Cancel']") WebElement cancelAssign_Button;
	@FindBy (xpath ="//android.widget.Button[@content-desc='Confirm']") WebElement confirmAssign_Button;
	
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
//	@FindBy (xpath ="") WebElement dfjdk;
	
	
	public Add_LeadPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void createLead_Interested()
	{
		PerformActions.clickAction(driver, addLead_IconButton);
		PerformActions.clickAction(driver, project_Dropdown);
		list = driver.findElements(By.xpath("//android.widget.Button[@content-desc=\"Select Project\"]/parent :: android.widget.ScrollView//android.view.View//android.widget.Button"));
		PerformActions.clickAction(driver, list.get(RandomClass.getRandomDataUpTONumber(list.size()-1))); list.clear();
		PerformActions.clickAction(driver, assignedUser_Input);
	    list = driver.findElements(By.xpath("//android.view.View/android.widget.RadioButton"));	    
	    int random=RandomClass.getRandomDataUpTONumber(list.size()-1); 
		PerformActions.clickAction(driver, list.get(random));list.clear();
		PerformActions.clickAction(driver, confirmAssign_Button);
		
	}

}

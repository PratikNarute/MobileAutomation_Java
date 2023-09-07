package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import io.appium.java_client.android.AndroidDriver;

public class Screenshot {

public static AndroidDriver driver;
	
	public static void  screenshot(AndroidDriver driver) throws IOException
	{
		
		String path = "C:\\Users\\Lenovo\\eclipse-workspace\\App_Testing\\Screenshots\\failed"+ System.currentTimeMillis()+".png";
		File drag=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dropPath = new File(path);	
		FileHandler.copy(drag, dropPath);
		
		//return path;
	}
	public static String  screenshotPath(AndroidDriver driver) throws IOException
	{
		
		String path = "C:\\Users\\Lenovo\\eclipse-workspace\\App_Testing\\Screenshots\\failed"+ System.currentTimeMillis()+".png";
		File drag=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dropPath = new File(path);	
		FileHandler.copy(drag, dropPath);
		
		return path;
	}
}

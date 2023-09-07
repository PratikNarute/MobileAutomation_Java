package utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class PerformActions
{
	public static void swipeAction(AndroidDriver driver, int startX, int startY, int endX, int endY )
	{
		    TouchAction touchAction = new TouchAction(driver);
		    PointOption pointStart = PointOption.point(startX, startY);
		    PointOption pointEnd = PointOption.point(endX, endY);
		    WaitOptions waitOption = WaitOptions.waitOptions(Duration.ofMillis(1000));
		    
		    touchAction.press(pointStart).waitAction(waitOption).moveTo(pointEnd).release().perform();
	}
	public static void longPress(AndroidDriver driver, int x, int y)
	{
		   TouchAction touchAction = new TouchAction(driver);
		   PointOption point = PointOption.point(x, y);
		   WaitOptions waitOption = WaitOptions.waitOptions(Duration.ofMillis(15000));
		   
		   touchAction.longPress(point).waitAction(waitOption).release().perform();
	}
	public static void scrollAction(AndroidDriver driver, int startX, int startY, int endX, int endY ) throws InterruptedException
	{
		TouchAction touchAction = new TouchAction(driver);
	    PointOption pointStart = PointOption.point(startX, startY);
	    PointOption pointEnd = PointOption.point(endX, endY);
	    WaitOptions waitOption = WaitOptions.waitOptions(Duration.ofMillis(2000));
	   
	    touchAction.press(pointStart).waitAction(waitOption).moveTo(pointEnd).release().perform(); 	   
	}
	public static void clickAction(AndroidDriver driver2, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver2,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void sendkAction(AndroidDriver driver, WebElement element, String data)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(data);
	}

}

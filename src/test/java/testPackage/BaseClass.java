package testPackage;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import utility.Screenshot;


public class BaseClass
{
	public static AppiumDriverLocalService service;
	public static AndroidDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	
	@BeforeSuite
	public void extendReport() throws MalformedURLException
	{
		report = new ExtentReports(); // To generate extent report
		spark = new ExtentSparkReporter("target/Spark.html");  //Set path in system for store the generated report
		report.attachReporter(spark); //To attach generated report into selected path
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pratik_Android");
		options.setApp("C:\\Users\\Lenovo\\eclipse-workspace\\App_Testing\\src\\test\\resources\\app\\Pratik.apk");
		
		driver = new AndroidDriver (new URL ("http://127.0.0.1:4723"),options);
	}
	@AfterSuite
	public void closeDriver() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}
	
//	@BeforeClass
//	public void configappium() throws MalformedURLException 
//	{
//		
////		service= new AppiumServiceBuilder().withAppiumJS(new File ("C:\\Users\\aksha\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
////				.withIPAddress(" http://127.0.0.1").usingPort(4723).build();
////		service.start();
//		
//		UiAutomator2Options options = new UiAutomator2Options();
//		options.setDeviceName("Pratik_Android");
//		options.setApp("C:\\Users\\Lenovo\\eclipse-workspace\\App_Testing\\src\\test\\resources\\app\\app-release.apk");
//		
//		driver = new AndroidDriver (new URL ("http://127.0.0.1:4723"),options);
//	
//	}
	
//	@AfterClass
//	public void tearoff() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		driver.quit();
////		service.stop();
//	}
	@BeforeMethod
	void putWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		System.out.println("Duration: "+(result.getEndMillis() - result.getStartMillis()));
		if (result.getStatus()== ITestResult.FAILURE)
		{
			//Screenshot.screenshot(driver);
			String path = Screenshot.screenshotPath(driver);
			test.fail("Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build()); 
			test.log(Status.FAIL, result.getThrowable());
						
		}
		else if ((result.getEndMillis() - result.getStartMillis())>=12000)
		{
			test.log(Status.WARNING, "Performace is poor");	
		}
		else
		{
			test.log(Status.PASS, "Test case is passed");
			
		}
		report.flush();
	}
	
	

}

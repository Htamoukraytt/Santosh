package Tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class TestBaseClass {
	
	
	 WebDriver driver;
	 
	 
	 public TestBaseClass() throws FileNotFoundException { // comes 
	    }
	 
	 
	 
	
	@BeforeMethod 
	public void setup() throws FileNotFoundException 
	{
		driver = DriverHelper.getDriver();
	  	
	  driver.get(ConfigReader.ReadProperty("URL_facebook"));
	  
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(ITestResult iTestResult) throws InterruptedException, IOException
	
	{
		
		 if(iTestResult.isSuccess()) {  // screenshot logic 
			
			 BrowserUtils.getScreenshot(driver,"FAILED-TestCase"); // calling screeenshot method 
			 
		 }
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}

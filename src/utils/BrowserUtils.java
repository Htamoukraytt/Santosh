package utils;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserUtils {
	
	
	
	
	// GET TEXT 
	 public static String getText(WebElement element) 
	 {
		  String txt =  element.getText().trim();
		 
		   return txt;
	 }
	
	
	 
	 
	// SELECT CLASS 
	public static void SelectBy(WebElement element ,String methodtype , String text) 
	
	{
		
		Select select = new Select(element);
		
	
		 switch(methodtype)
		 
		 {
		 
		 case "index" :select.selectByIndex(Integer.parseInt(text)); break;
		 
		 
		 case "value" :select.selectByValue(text); break;
		 
		 
		 case "text"  :select.selectByVisibleText(text); break;
		 
		 
		 default : System.out.println("Wrong select method !!");
		 Assert.fail(); break;
	
		 }}
		 
		 
	
	
	
	
	
	
	     // logic for getWindowHandle(only 2 tabs)
	
	      public void SwitchByID(WebDriver driver) {
		   
		      String  MainPageID = driver.getWindowHandle(); // Single id 
		      
		      Set<String> allIDES = driver.getWindowHandles(); // all IDES  
		      
		        for(String eachID : allIDES) {
		        	
		         driver.switchTo().window(eachID);
		         
		         if(!eachID.equals(MainPageID)) {
		        	 
		        	 break;
		        	 
		        	 
		         }
		        	
		        }
		      
		      
		   
		   
		
	         }
		 
	      
	     // logic for getWindowHandles-- handles all windows by using IO OF TAB TO BREAK;
	      
		 public static void switchByTitle(WebDriver driver ,String title) {
			 
			 
		   Set<String>    ListOfIdes =  driver.getWindowHandles();
		   

		   
		    for(String  eachId : ListOfIdes) {
		    	
		    	 driver.switchTo().window(eachId);
		    	
		    	if(driver.getTitle().equals(title)) {
		    		
		    		break;  } 
		    	 }
		     
		    
		 }
		 
		  
		 
		 
		 
	  
		 // SCREENSHOT LOGIC FOR TESTNG FRAMEWORK 
		  
		 public static void getScreenshot(WebDriver driver , String testcaseName) throws IOException {
			 
			 TakesScreenshot tScreenshot = (TakesScreenshot) driver;    // casting since its interface 
			
			 File sf= tScreenshot.getScreenshotAs(OutputType.FILE);  // screen shot here now 
			 
			 File  f = new File("./Screenshots/"+testcaseName+".png");   //  specfing location we want / package name is dynamic 
			 
			 
			 FileUtils.copyFile(sf, f);  // connecting source screenshot to location ....
				
	                                             
			 
		 }
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



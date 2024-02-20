package pages;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.BrowserUtils;

public class Login_page {
	
	
	
	 public Login_page(WebDriver driver) {
		 
		PageFactory.initElements( driver,this); 
	 }
	  
	
	
	 
	 @FindBy(css = "#email")
	 WebElement   emailElement;
	 
	 
	 @FindBy(css = "#pass")
	 WebElement   passWorElement;
	 
	
	 @FindBy(xpath = "//button[@type='submit']")
	 WebElement   LogingButton; 
	 
	 
	 
	 @FindBy(xpath = "//a[.='Not you?']")
	 WebElement actualErrorMessagElement;
	 
	 
	 // register 
	 
	 @FindBy(xpath = "//a[contains(text(),'Create new account')]")
	 WebElement createNewAccountButtonElement;
	 
	  @FindBy(xpath = "//input[@name='firstname']")
	  WebElement firstNameElement;
	 
	  @FindBy(xpath = "//input[@name='lastname']")
	  WebElement lastNameElement;
	  
	  @FindBy(xpath = "//input[@name='reg_email__']")
	  WebElement emailOrPhoneNumberTxtBoxElement;
	  
	  @FindBy(xpath = "//input[@name='reg_passwd__']")
	  WebElement newPasswordTextBoxElement;
	  
	  @FindBy(xpath = "//select[@id='month']")
	  WebElement monthSelectBoxElement;
	 
	  @FindBy(xpath = "//select[@id='day']")
	  WebElement daySelectElement;
	  
	  @FindBy(xpath = "//select[@id='year']")
	  WebElement yearSelectElement;
	  
	  @FindBy(xpath = "//label[.='Male']")
	  WebElement gendeRadioButto_Male;
	  
	  
	  @FindBy(xpath = "//label[.='Famle']")
	  WebElement gendeRadioButto_famle;
	  
	  @FindBy(xpath = "//button[@name='websubmit']")
	  WebElement signUpButtonElement;
	  
	  
	 @FindBy(tagName = "H2")
	 WebElement actual_ConfirmationCodeText;
	
	
	
	  // Happy Path Login methods 
	 
	 public void HappyPathLogin(WebDriver driver,String inputEmail , String passwordInput) throws InterruptedException {
		 
		emailElement.sendKeys(inputEmail); 
		Thread.sleep(500);
		passWorElement.sendKeys(passwordInput);;
		Thread.sleep(500);
		LogingButton.click();
		
		 
	}
	 
	// Negative scenario  Login method
	 public void Negative_Login(WebDriver driver,String inputEmail , String WrongpasswordInput) throws InterruptedException {
		 
		emailElement.sendKeys(inputEmail); 
		Thread.sleep(500);
		passWorElement.sendKeys(WrongpasswordInput);;
		Thread.sleep(500);
		LogingButton.click(); 
		
		// wait explicit wait time 
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(actualErrorMessagElement));
		
		Assert.assertEquals(actualErrorMessagElement.getText(),"Not you?");
		
		Thread.sleep(5000);
		 
	}
	 
	
	 
	 
	 
	 
	 
	 
	  // happy sign up (register account )
	  @Test
	  public void positive_SginUp(WebDriver driver,String fName, String lname , String emailOrPhone , String newPassword ) throws Exception
	  {
		  
		  createNewAccountButtonElement.click();

		  Thread.sleep(500);
		  
		  firstNameElement.sendKeys(fName);
		  
		  lastNameElement.sendKeys(lname);
		  
		  emailOrPhoneNumberTxtBoxElement.sendKeys(emailOrPhone);
		  
		  
		  newPasswordTextBoxElement.sendKeys(newPassword);
		  
		  
		
		  
		  BrowserUtils.SelectBy(monthSelectBoxElement,"text","Nov");
		  
		  
		  BrowserUtils.SelectBy(daySelectElement,"value","20");
		  
		  
		  BrowserUtils.SelectBy(yearSelectElement,"text","1990");
		  
		  
		  
		 gendeRadioButto_Male.click();
		 
		 
		 
		 signUpButtonElement.click(); 
		  
		 
	     WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30)); // WITING FOR THE ELEMENT TO BE LOADED 
	     wait.until(ExpectedConditions.visibilityOf(actual_ConfirmationCodeText));
		  
		  
		 String actualText = actual_ConfirmationCodeText.getText();
		 
		 Assert.assertEquals(actualText, "Enter the confirmation code from the text message");
		  
	 
		  
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	// this was testing testmg framework 
  
//  	 @Test(priority = 1)
//  	 public void Tc_001() throws FileNotFoundException
//  	 {
//  		 
//  	    //	Assert.assertEquals("Said", "said"); 
//  		 
//  		 WebDriver  driver = new ChromeDriver();
//  		 
//  		
//  		 driver.get(ConfigReader.ReadProperty("URL_google"));
//  		 
//  		  
//  
//  		 driver.close();
//  	 }
//	  
//  	 
//  	 
//  	 @Test(priority = 2 , dependsOnMethods = "Tc_001")
//  	 public void Tc_002() throws FileNotFoundException
//  	 {
//  		 
//  	    //	Assert.assertEquals("Said", "said"); 
//  
//  		 WebDriver  driver = new ChromeDriver();
//  		 
//  		
//  		 driver.get(ConfigReader.ReadProperty("URL_facebook"));
//  		 
//  		  
//  
//  		 driver.close();
//  	 }
//  	 
//  	 
//  	 
//  	 @Test(priority = 3 , dependsOnMethods = "Tc_002")
//  	 public void Tc_003() throws FileNotFoundException
//  	 {
//  		 
//  	    //	Assert.assertEquals("Said", "said"); 
//  
//  		 WebDriver  driver = new ChromeDriver();
//  		 
//  		
//  		 driver.get(ConfigReader.ReadProperty("URL_youtube"));
//  		 
//  		  
//  
//  		 driver.close();
//	
//		
//  	 }	 
//  	 
//  	 
//  	 @Test(priority = 4 , dependsOnMethods = "Tc_003")
//  	 public void Tc_004() throws FileNotFoundException
//  	 {
//  		 
//  	    //	Assert.assertEquals("Said", "said"); 
//  
//  		 WebDriver  driver = new ChromeDriver();
//  		 
// 
//  		 driver.get(ConfigReader.ReadProperty("URL_etsy"));
//  		 
//  		 
//  		 driver.close();
//	
//		
//  	 }	 
//  	 
  	 
  	 
		
		
  	 
  	 
  	 
  	 
  	 
  	 
  	 
  	 
  	 
  	 
		
	}
	
	
    



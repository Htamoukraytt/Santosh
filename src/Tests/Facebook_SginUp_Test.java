package Tests;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import pages.Login_page;
import utils.ConfigReader;

public class Facebook_SginUp_Test extends TestBaseClass{
	
	
	
	
	
	

	public Facebook_SginUp_Test() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	// happy path creating an account TEST case 
	@Test(groups = "Regression")
	public void Tc_HappyPath_SginUp() throws Exception {
		
		Login_page lPage = new Login_page(driver);
		
		lPage.positive_SginUp(driver, ConfigReader.ReadProperty("first_Name_For_SginUp")
				                    , ConfigReader.ReadProperty("last_Name_For_SginUp")
				                    ,ConfigReader.ReadProperty("phone_Number_For_SginUp")
				                    ,ConfigReader.ReadProperty("newPassword_For_SginUp"));
		
			}
	
	
	  // tASK 
//	  
//	  @Test(groups = "Regression")
//	  public void Task()
//	  {
//		  
////		 WebDriver driver = new ChromeDriver();
////		 driver.manage().window().maximize();
////	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
////	     
////	     
////	     driver.get("https://www.facebook.com");
////	     
//	     WebElement createAccountElement = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
//	     createAccountElement.click();
//	     
//	     
//	     
//	     WebElement fisrtNamElement = driver.findElement(By.xpath("//input[@name='firstname']"));
//	     fisrtNamElement.sendKeys("hamid");
//	     
//	     
//	     WebElement lastNamElement = driver.findElement(By.xpath("//input[@name='lastname']"));
//	     lastNamElement.sendKeys("hamidovic");
//	     
//	     
//	     WebElement  emailElement = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//	     emailElement.sendKeys("7712732372");
//	     
//	     
//	     WebElement  newpassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//	     newpassword.sendKeys("said2938nds");
//	     
//	     
//	     
//	     WebElement monthElement  = driver.findElement(By.xpath("//select[@id='month']"));
//	     Select selectobj = new Select(monthElement);
//	     selectobj.selectByVisibleText("Feb"); 
//	     
//	     
//	     WebElement dayElement  = driver.findElement(By.xpath("//select[@id='day']"));
//	     Select selectobj1 = new Select(dayElement);
//	     selectobj1.selectByVisibleText("15");
//	     
//	     
//	     WebElement yearElement  = driver.findElement(By.xpath("//select[@id='year']"));
//	     Select selectobj2 = new Select(yearElement);
//	     selectobj2.selectByVisibleText("1990"); 
//	     
//	     
//	     
//	     
//	     WebElement   maleGender= driver.findElement(By.xpath("//label[.='Male']"));
//	     maleGender.click();  
//	     
//	     
//	     
//	     WebElement submitelmElement = driver.findElement(By.xpath("//button[@name='websubmit']"));
//	     submitelmElement.click();
//	     
//	     
//	  }

}

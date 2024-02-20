package Tests;
import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataGenerator.DataProviderClass;
import pages.Login_page;
import utils.ConfigReader;

public class Facebook_LogIn_Test extends TestBaseClass {
	
	
	
	
	
	
	public Facebook_LogIn_Test() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}




    // regular data from config.prop
	@Test(enabled = false ,groups = {"Regression","Smoke"})
	public void Tc_LogIn() throws Exception
	{
		Login_page pg = new Login_page(driver);
		
		pg.HappyPathLogin(driver,ConfigReader.ReadProperty("email"), ConfigReader.ReadProperty("password"));
		Assert.fail();
		
	} 
	
	
	
	
	
	
	
	//Test case of login with set of data form data provider // same test case with set of multiple data 
		@Test(groups = {"Regression","Smoke"}, dataProvider = "LoginData" ,dataProviderClass = DataProviderClass.class)
		public void Tc_LogIn_1(String userNameString , String password) throws Exception
		{
			Login_page pg = new Login_page(driver);
		
			pg.HappyPathLogin(driver, userNameString, password);
			
		} 
	
	
	 
	
	
	
	@Test(enabled = false , groups =  "Smoke")
	public void Tc_Negative_logIn() throws Exception, InterruptedException
	{
		Login_page pg = new Login_page(driver);
		pg.Negative_Login(driver,ConfigReader.ReadProperty("email"), ConfigReader.ReadProperty("Wrongpassword"));
		
		
	}
	
	

}

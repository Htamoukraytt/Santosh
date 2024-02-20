package dataGenerator;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	
	
	
	@DataProvider(name = "LoginData")
	public Object[][] getLoginData() {
		
		
		Object[][] getData = {
				
				{"username","password"},
				{"username","password"},
				{"username","password"}
				
				
				};
		
		return  getData;
	}

}

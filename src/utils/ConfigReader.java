package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	
	
	
	
	// logic to read form our configuraition.properties file 
	public static String ReadProperty(String key) throws FileNotFoundException 
	{
		
		FileReader file = new FileReader("./src/TestData/configuration.properties");
		
		
		Properties properties = new Properties();
		
		try {
			properties.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		return properties.getProperty(key);
		
		
		
	}

}

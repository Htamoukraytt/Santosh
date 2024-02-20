package utils;
import java.io.FileNotFoundException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverHelper {
	
	
	
	
	
	// nobody can create object from it and manipulate
	private  static WebDriver driver ;

    
    
    
    private  DriverHelper(){  // made the constructor private ==> nobody can create an object
        // and manipulate my driver from this class
    }


    
    
    

    // Method
    public static WebDriver getDriver() throws  FileNotFoundException {
        if(driver==null || ((RemoteWebDriver)driver).getSessionId()==null){
           // String browser="chrome"; // **

            switch (ConfigReader.ReadProperty("browser")){

                case "chrome":
                   
                    driver=new ChromeDriver();
                    break;
                case "firefox":
              
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                  
                    driver=new EdgeDriver();
                    break;
                case "safari":
                   
                    driver=new SafariDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            // driver.manage().deleteAllCookies();   // clearing data starts fresh its under suite
        }

        return  driver;
    }

	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass {
	
	public WebDriver driver;
	public void intializeDriver() throws IOException  {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Avinash\\eclipse-workspace\\FrameWorkLearning\\src\\main\\java\\Resources\\Data.properties");
		
		Properties prop = new Properties();
		prop.load(fs);
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}else;
		if(browserName.equalsIgnoreCase("Edge")) {
			driver =new EdgeDriver();
		}
	}

}

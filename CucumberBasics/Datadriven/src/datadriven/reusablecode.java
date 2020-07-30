package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class reusablecode{
	@Test
	public void Login() throws IOException {
		WebDriver driver=null;
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mv114t\\eclipse-workspace\\Datadriven\\src\\datadriven\\datadriven.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "H:\\Chromeselenium\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "H:\\Chromeselenium\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "H:\\Chromeselenium\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}

}

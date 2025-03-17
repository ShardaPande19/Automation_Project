package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	
	@BeforeTest
	public void setUP() throws IOException {
		
		if(driver==null) {
			
			
			System.out.println("The path is :"+System.getProperty("user.dir"));
			
			FileReader fr = new FileReader("C:\\Users\\Sharda\\Desktop\\Selenium\\Selenmium\\TestAutomationFreamwork\\src\\test\\resources\\configfiles\\config.properties");
			
			prop.load(fr);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.get(prop.getProperty("testurl"));

		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			 driver = new FirefoxDriver();
		}
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("teardown sucessful");
	}

}

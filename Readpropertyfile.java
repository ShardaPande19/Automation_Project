package utilies;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		FileReader fr = new FileReader("C:\\Users\\Sharda\\Desktop\\Selenium\\Selenmium\\TestAutomationFreamwork\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		
		System.out.println(p.getProperty("testurl"));

		
	}
}
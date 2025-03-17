package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;


public class MyFirstTestFW extends BaseTest {
	
	
	
	@Test

	public static void LogineTest() throws InterruptedException {
		
		System.out.println("cclick sucessfully");
        Thread.sleep(2000);

		driver.findElement(By.linkText("Sing in")).click();
        Thread.sleep(2000);

		driver.findElement(By.id("login id")).sendKeys("shardapande93@gmail.com");
        Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
         Thread.sleep(2000);
         
 		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("shardapande@123");
        Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();


		
			
	}
	



}

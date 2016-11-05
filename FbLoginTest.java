package facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginTest {
	
	public static void main(String args[]) throws InterruptedException
	{
		//create the webdriver//
		
		WebDriver d=new FirefoxDriver();
		
		//give the url//
		
		Thread.sleep(500);
		
		d.get("https://www.facebook.com");

	
		//type the mail address//
		
		Thread.sleep(500);
		d.findElement(By.name("email")).sendKeys("swathireddymarri@gmail.com");
		
		//type the password//
		
		
		Thread.sleep(500);
		d.findElement(By.name("pass")).sendKeys("Swathireddy@123");
		
		//click the login//
		
		Thread.sleep(500);
		d.findElement(By.id("u_0_n" )).click();
		
		//click the arrow button to logout// 
				Thread.sleep(500);
				d.findElement(By.id("userNavigationLabel")).click();
				
				//click the logout button//
				
				Thread.sleep(500);
				d.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
				
		
		
		
		
		
	}
}

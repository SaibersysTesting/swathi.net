package logingmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailLogin {
	
	public static void main(String args[]) throws InterruptedException
	{
		//create a webdriver//
		
		WebDriver d=new FirefoxDriver();
		
		//give the url//
		
		Thread.sleep(500);
		
		d.get("https://www.google.com/?gws_rd=ssl");
		
		//click the gmail button//
		Thread.sleep(500);
		d.findElement(By.id("gb_70")).click();
		
		//enter the mail address//
		Thread.sleep(500);
		
	d.findElement(By.id("Email" )).sendKeys("swathireddyar87@gmail.com");
	//enter the next button//
	Thread.sleep(500);
	d.findElement(By.id("next" )).click();
	
	//enter the password//
	
	Thread.sleep(500);
	d.findElement(By.id("Passwd" )).sendKeys("Swathireddyar@123");
	
	//enter the signin//
	
	Thread.sleep(500);
	d.findElement(By.id("signIn")).click();
	
	//click on gmail//
	
	Thread.sleep(500);
	d.findElement(By.linkText("Gmail")).click();
	
	//click signout button//
	
	Thread.sleep(500);
	d.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	
	
	Thread.sleep(500);
	
	d.findElement(By.id("gb_71")).click();
	
	
	
	
	
	
		
		
		
		
		
		
		
	}

}

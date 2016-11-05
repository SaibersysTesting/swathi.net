package loginpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTestCase

{
	public static void main(String args[])
	{
	
	//create webdriver//
	
	WebDriver d=new FirefoxDriver();
	
//give the firefox url//
	
	d.get("https://www.google.com/?gws_rd=ssl");
}
}

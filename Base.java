package com.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public WebDriver driver;
	public void intialiseBrowser()
	{
		System.setProperty("webdriver.chromr.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\com\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.intialiseBrowser();
	}

}

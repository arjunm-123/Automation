package com.Automation;

import org.openqa.selenium.By;

public class LocateAssignment extends Base
{
	public void batchId()
	{
		driver.findElement(By.id("placeholder")); //id 1
		driver.findElement(By.id("message-one")); // id 2
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.id("button-one")); //id3
		driver.findElement(By.id("button-two")); //id4
		driver.findElement(By.id("message-two")); //id4
		
	}
	public void batchClass()
	{
		driver.findElement(By.className("card-header"));
		driver.findElement(By.className("my-2"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.className("card-header"));
		driver.findElement(By.className("form-check-label"));
		driver.findElement(By.className("btn btn-primary"));
	}

	public static void main(String[] args) {
		LocateAssignment locateassignment = new LocateAssignment();
		locateassignment.intialiseBrowser();
		locateassignment.batchId();
		locateassignment.batchClass();
		locateassignment.browserCloserQuit();
		
		}

}

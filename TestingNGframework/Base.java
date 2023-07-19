package comobsqura.TestingNGframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public void intialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\com\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
	}
	@AfterMethod
	public void browserCloserQuit()
	{
		//driver.close();   // driver.close() closes only the current window on which Selenium is running automated tests.
		driver.quit();     // driver.quit() method closes all browser windows and ends the WebDriver session.
	
	}
}

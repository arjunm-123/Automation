package comobsqura.TestingNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationEX 
{	
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\main\\java\\com\\Automation\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	@BeforeTest 
	public void beforeTest()
	{
	driver.manage().window().maximize(); System.out.println("Before test");
	}
	@BeforeClass
	public void beforeClass()
	{
	driver.get("https://selenium obscurazone.com/simple-form-demo.php"); System.out.println("Before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
	WebElement singleInputField = driver.findElement(By.xpath("//input[@id='single-input-field'"));
	singleInputField.sendKeys("Hello");
	System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
	driver.manage().window().minimize(); System.out.println("After method");
	}
	@AfterClass

	public void afterClass()
	{
	driver.quit(); System.out.println("After class");
	}
	 @AfterTest

	public void afterTest()
	{
	System.out.println("Report is ready"); System.out.println("After Test");
	}
	@AfterSuite
	public void afterSuite()
	{
	System.out.println("Report is ready"); System.out.println("After suite");
	}
}
	


package comobsqura.TestingNGframework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertsSample extends Base
{
	@Test
public void alertsExamples()
{
	driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
	WebElement clickButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	clickButton.click();
	
	driver.switchTo().alert().accept();
	WebElement clickme2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	clickme2.click();
	driver.switchTo().alert().accept();
	
	WebElement message = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
	String expectedConfirmMessage = "You pressed OK!";
	String actualConfirmMessage = message.getText();
	assertEquals(expectedConfirmMessage, actualConfirmMessage,"not displayed you Pressed Ok!");
	clickme2.click();
	driver.switchTo().alert().dismiss();
	String expectedConfirmMessage2 = "You pressed Cancel!";
	String actualConfirmMessage2 = message.getText();
	assertEquals(expectedConfirmMessage2, actualConfirmMessage2,"not displayed you pressed cancel");
	
	String textEnter = "aju";
	WebElement clickForpromtBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	clickForpromtBox.click();
	driver.switchTo().alert().getText();
	driver.switchTo().alert().sendKeys(textEnter);
	driver.switchTo().alert().accept();
	
	WebElement promtMessage = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
	String expectedPromtMessage="You have entered 'aju' !";
	String actualPromtMessage=promtMessage.getText();
	assertEquals(expectedPromtMessage,actualPromtMessage,"not display You have entered 'aju'!");
	clickForpromtBox.click();
	driver.switchTo().alert().dismiss();
	
	
	
}
	}

package comobsqura.TestingNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebelementCommands extends Base
{
@Test
public void webElementcommand()
{
	WebElement singleInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
	singleInputField.sendKeys("Hello");
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	showMessageButton.click();
	
	WebElement yourMessage =driver.findElement(By.xpath("//div[@id='message-one']"));
	String yourMessageText= yourMessage.getText();
	String yourMessageTag=yourMessage.getTagName();
	String showMessageButtonClassName = showMessageButton.getAttribute("class");
	singleInputField.clear();
	boolean isShowMessageButtonDisplayed = showMessageButton.isDisplayed();
	boolean isShowMessageButtonEnabled = showMessageButton.isEnabled();
	String backgroundColorOfShowMessageButton = showMessageButton.getCssValue("background-color");
	int showMessageButtonXaxis =showMessageButton.getLocation().getX();
	int showMessageButtonYaxis =showMessageButton.getLocation().getY();
	int singleInputFieldXaxis = singleInputField.getLocation().getX();
	int singleInputFieldYaxis = singleInputField.getLocation().getY();
	int showMessageButtonHeight =showMessageButton.getSize().getHeight();
	int showMessageButtonWidth =showMessageButton.getSize().getWidth();
}
}

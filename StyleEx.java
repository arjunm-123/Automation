package comobsqura.TestingNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import comobsqura.TestingNGframework.Base;

public class StyleEx  extends Base
{
	@Test
public void style()
{
	WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
	String backgroundColorOfShowMessageButton =showMessage.getCssValue("background-color");
	String borderColorOfShowMessageButton = showMessage.getCssValue("border-color");
	String fontWeightOfShowMessageButton = showMessage.getCssValue("font-weight");
	String showMessageClassName = showMessage.getCssValue("class");
	String showMessageId = showMessage.getAttribute("id");
	String showMessageTag = showMessage.getCssValue("type");
	
	WebElement getTotal =driver.findElement(By.xpath("//button[@id='button-two']"));
	String backgroundColorOfGetTotalButton = getTotal.getCssValue("background-color");
	String bordercolorOfGetTotalButton = getTotal.getCssValue("border-color");
	String fontWeightOfGetTotalButton = getTotal.getCssValue("font-weight");
	String getTotalClassName = getTotal.getAttribute("class");
	String getTotalId = getTotal.getAttribute("id");
	String getTotaltag = getTotal.getAttribute("type");
		
}
	@Test
	public void webelement()
	{
	//WebElement twoInputFields = driver.findElement(By.xpath("//div[@class='card-header']"));
		
	WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
	enterValueA.sendKeys("1");
	WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
	enterValueB.sendKeys("2");
	WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotal.click();
		
}
}
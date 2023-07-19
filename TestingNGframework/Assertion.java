package comobsqura.TestingNGframework;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Assertion extends Base
{
@Test
public void verifySingleInputFieldWhenEnterDataOnTextFieldAndClickOnShowMessageButton()
{
String textFieldInput = "Hello";
String expectedMessage = "Your Message : "+textFieldInput;
WebElement singleInputField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
singleInputField.sendKeys(textFieldInput);
WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
showMessageButton.click();
WebElement yourMessage =driver.findElement(By.xpath("//div[@id='message-one']"));
String yourMessageText = yourMessage.getText();
assertEquals(expectedMessage,yourMessageText,"Your Message Is No"+expectedMessage);


}
@Test
public void assertTrueSample()
{
	String expectedValue ="abc";
	String actualValue = "abc";
	boolean flag = false;
	if (expectedValue.equals(actualValue));
	{
		flag = true;
	}
	assertTrue(flag,"Expected value and actual value ");
}
@Test
public void verifyShowMessageButtonText()
{
	String expectedTextOfShowMessageButton ="Show Message";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String getTextOfShowMessageButton = showMessageButton.getText();
	assertEquals(getTextOfShowMessageButton,expectedTextOfShowMessageButton,"Text of show message button is not matching");
}
@Test
public void verifyTheColorOfShowmessageButton()
{
	String expectedcolor ="rgb(255, 255, 255)";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String getShowMessageButton = showMessageButton.getCssValue("color");
	assertEquals(showMessageButton,expectedcolor,"color is not same"+expectedcolor);
}
@Test
public void verifyTheFontWeightOfShowMessageButton()
{
	String expectedFontWeightOfShowmessageButton = "400;";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String fontWeightOfShowmessageButton = showMessageButton.getCssValue("font-weight");
	assertEquals(fontWeightOfShowmessageButton,expectedFontWeightOfShowmessageButton,"font weight is not matching");
}
@Test
public void  verifyBackgroundColorOfShowMessageButton()
{
	String expectedBackgroundColorOfShowMessageButton ="rgb(0, 123, 255)";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String backgroundColorOfShowMessageButton= showMessageButton.getCssValue("background-color");
	assertEquals(backgroundColorOfShowMessageButton,expectedBackgroundColorOfShowMessageButton,"background color not matching"); 
}
public void verifyTwoInputFieldWhenValueEnterOnTextFieldAndClickOnGetTotalButton()
{
	int textEnterValueA = 20;
	int textEnterValueB = 30;
	
	String excepetedTotalValueOfAandB ="Total A + B :"+(textEnterValueA+textEnterValueB);
	WebElement enterValueA = driver.findElement(By.xpath("//input[@id='value-a']"));
	enterValueA.sendKeys(String.valueOf(textEnterValueA));
	WebElement enterValueB = driver.findElement(By.xpath("//input[@id='value-b']"));
	enterValueB.sendKeys(String.valueOf(textEnterValueB));
	WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
	getTotal.click();
	String getTotalButton = getTotal.getText();
	WebElement totalAPlusBmessage =driver.findElement(By.xpath("//div[@id='message-two']"));
	String totalAPlusBmessageText =totalAPlusBmessage.getText();
	assertEquals(excepetedTotalValueOfAandB,totalAPlusBmessageText,"value is not matching with"+excepetedTotalValueOfAandB);
}
@Test
public void verifyShowMessageButtonIsDisplayedusingAssertTrue()
{
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']")); 
	boolean isShowMessageButtonDisplayed =showMessageButton.isDisplayed();
	assertTrue(isShowMessageButtonDisplayed,"ShowMessageButtonDisplayed");
}
@Test
public void verifysetTotalButtontsenabledusingAssertTrue()
{
	WebElement getTotal = driver.findElement(By.xpath("//button[@id='button-two']"));
	boolean isTotalButtonIsEnabled = getTotal.isEnabled();
	assertTrue(isTotalButtonIsEnabled,"get total button enabled");
		
}

@Test
public void assertFalseSample()
{
	boolean flag = false;
	assertFalse(flag,"flag is true");
}
@Test
public void assertNullSample()
{
	String Value =null;
	assertNull(Value,"Value is not null");
}
@Test
public void assertNotNullSample()
{
	String value="ABC";
	assertNotNull(value,"Value is null");	
}
@Test
public void softAssert()
{
	String Value ="123";
	String value="ABC";
	SoftAssert  SoftAssert = new SoftAssert();
	SoftAssert.assertNull(Value,"Value is not null");
	SoftAssert.assertNotNull(value,"Value is null");
	
}
@Test
public void verifyTheHeightAndWidthOfShowMessageButton()
{
	
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	int actualHeightOfShowMessageButton =38;
	int expectedHeightOfShowMessageButton = showMessageButton.getSize().getHeight();
	int actualWidthOfShowMessageButton = 136;
	int expectedWidthOfShowMessageButton = showMessageButton.getSize().getWidth();
	assertEquals(actualHeightOfShowMessageButton,expectedHeightOfShowMessageButton,"height exceeds");
	assertEquals(actualWidthOfShowMessageButton,expectedWidthOfShowMessageButton,"the width exceeds");
}@Test
public void amazonShouldBeInObsquraURL()
{
	boolean pageSource =driver.getPageSource().contains("Amazon");
	assertFalse(pageSource," pagesource contains Amazon");
}@Test
public void verifyTheButtonColorBackGroundColorAndFontWeightOfShowMessageButton()
{
	String expectedcolor ="rgb(255, 255, 255)";
	WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
	String showMessageButtonColor =showMessageButton.getCssValue("color");
	String expectedBackGroundColor = "rgba(0, 123, 255, 1)";
	String showMessageButtonBackGroundColor = showMessageButton.getCssValue("background-color");
	String exceptedFontWeight ="400";
	String showMessageButtonFontWeight = showMessageButton.getCssValue("font-weight");
	
	assertEquals(showMessageButtonColor, expectedcolor,"The color is not same as "+expectedcolor);
	assertEquals(showMessageButtonBackGroundColor, expectedBackGroundColor, "The actual color doesnot match with "+expectedBackGroundColor);
	assertEquals(showMessageButtonFontWeight, exceptedFontWeight, "The weight is not same as "+exceptedFontWeight);
	
	
}@Test
public void verifyEnterValueBIsAllignedBelowOfEnterValueA()
{
	WebElement enterValueA= driver.findElement(By.xpath("//input[@id='value-a']"));
	int yAxisOfEnterValueA=enterValueA.getLocation().getY();
	WebElement enterValueB= driver.findElement(By.xpath("id=\"value-b\""));
	int yAxisOfEnterValueB=enterValueB.getLocation().getY();
	boolean expectedResult =yAxisOfEnterValueA<yAxisOfEnterValueB;
	assertTrue(expectedResult,yAxisOfEnterValueB+"is greaterThan "+yAxisOfEnterValueA);
	
}
}

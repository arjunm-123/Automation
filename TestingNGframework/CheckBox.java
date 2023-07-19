package comobsqura.TestingNGframework;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends Base
{
	@Test
public void checkBox()
{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxClick = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBoxClick.click();
		boolean isCheckBoxSelected = checkBoxClick.isSelected();
		assertTrue(isCheckBoxSelected,"CheckBox is not Selected");

	}
	@Test
	public void verifyWhenClickSelectAllButtonAndUnSelectAllButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		selectAllButton.click();
		boolean isSelectAllButtonDisplayed = selectAllButton.isDisplayed();
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean isCheckBoxOneSelected = checkBoxOne.isSelected();
		
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean isCheckBoxTwoSelected =checkBoxTwo.isSelected();
		
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean ischeckBoxThreeSelected = checkBoxThree.isSelected();
		
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBoxFourSelected = checkBoxFour.isSelected();
		
		
		WebElement unSelectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		unSelectAllButton.click();
		boolean isunSelectAllButtonDisplayed = unSelectAllButton.isDisplayed();
		WebElement checkBoxOneUnselected = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean isCheckBoxOneUnSelected = checkBoxOne.isSelected();
		
		WebElement checkBoxTwoUnselected = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean isCheckBoxTwoUnSelected =checkBoxTwo.isSelected();
		
		WebElement checkBoxThreeUnselected = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean ischeckBoxThreeUnSelected = checkBoxThree.isSelected();
		
		WebElement checkBoxFourUnselected = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean isCheckBoxFourUnSelected = checkBoxFour.isSelected();
		

	
		
		assertTrue(isSelectAllButtonDisplayed,"SelectAll Button Is Not Displayed");
		assertTrue(isCheckBoxOneSelected,"CheckBox One Is Not Displayed");
		assertTrue(isCheckBoxTwoSelected,"CheckBox Two Is Not Displayed");
		assertTrue(ischeckBoxThreeSelected,"checkBox Three is Not Displayed");
		assertTrue(isCheckBoxFourSelected,"CheckBox four Is Not Displayed");
		assertTrue(isunSelectAllButtonDisplayed,"unselect Button is Displayed");
		assertTrue(isCheckBoxOneUnSelected,"CheckBox One  Displayed");
		assertTrue(isCheckBoxTwoUnSelected,"CheckBox Two  Displayed");
		assertTrue(ischeckBoxThreeUnSelected,"checkBox Three  Displayed");
		assertTrue(isCheckBoxFourUnSelected,"CheckBox four  Displayed");
		
	}
}


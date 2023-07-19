package comobsqura.TestingNGframework;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base
{
	@Test
public void radioButtonDemo()
{
	driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radioButtonMale.click();
	boolean isCheckBoxSelectedMale = radioButtonMale.isSelected();
	WebElement radioButtonFemale= driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	radioButtonFemale.click();
	boolean isCheckBoxSelectedFemale = radioButtonFemale.isSelected();
	assertTrue(isCheckBoxSelectedMale,"CheckBox is not Selected Male");
	assertTrue(isCheckBoxSelectedFemale,"CheckBox is not Selected Female");
}
	@Test
	public void verifyWhenClickPateintsGenderAndPateintsAgeGroupShowsInGetResultButton()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement pateinsgenderMale = driver.findElement(By.xpath("//input[@id='inlineRadio11']")); 
		pateinsgenderMale.click();
		boolean isRadioButtonSelectedPateinsGenderMale = pateinsgenderMale.isSelected();
		WebElement pateinsgenderFemale = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		pateinsgenderFemale.click();
		boolean isRadioButtonSelectedPatiensGenderFemale = pateinsgenderFemale.isSelected();
		
		WebElement pateinsAgeGroup1To18 = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		pateinsAgeGroup1To18.click();
		boolean isRadioButtonSelectedPatiensAgeGroup1To18 = pateinsAgeGroup1To18.isSelected();
		
		WebElement pateinsAgeGroup19To44 = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		pateinsAgeGroup19To44.click();
		boolean isRadioButtonSelectedPateinsAgeGroup19To44 = pateinsAgeGroup19To44.isSelected();
		
		WebElement pateinsAgeGroup45To60 = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		pateinsAgeGroup45To60.click();
		boolean isRadioButtonSelectedPateinsAgeGroup45To60 = pateinsAgeGroup45To60.isSelected(); 
		
		WebElement getResults = driver.findElement(By.xpath("//button[@id='button-two']"));
		getResults.click();
		boolean isGetResultButtonDisplayed = getResults.isDisplayed();
		
		
		
		assertTrue(isRadioButtonSelectedPateinsGenderMale,"radio button is not male");
		assertTrue(isRadioButtonSelectedPatiensGenderFemale ,"radio button is not female");
		assertTrue(isRadioButtonSelectedPatiensAgeGroup1To18,"RadioButtonSelected is notPatiens Age Group 1To18");
		assertTrue(isRadioButtonSelectedPateinsAgeGroup19To44,"RadioButtonSelected is not Patiens Age Group19To44");
		assertTrue(isRadioButtonSelectedPateinsAgeGroup45To60,"RadioButtonSelected is not PateinsAgeGroup45To60");
		assertTrue(isGetResultButtonDisplayed,"GetResult Button is not Displayed");
	}
}

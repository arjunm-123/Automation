package comobsqura.TestingNGframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends Base
{
	@Test
public void dropdownusingSelectButton()
{
	driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select = new Select(dropdown);
	select.selectByVisibleText("Red");
	select.selectByValue("Yellow");
	select.selectByIndex(3);
	List<WebElement> options = select.getOptions();
	int size = options.size();
	

	WebElement multipleDropDown = driver.findElement(By.xpath("//select[@id='multi-select-field']")); 
	Select select2 = new Select(multipleDropDown);
	boolean isMultiple = select2.isMultiple();

	select2.selectByVisibleText("Red");
	select2.selectByValue("Yellow");
		
}

}
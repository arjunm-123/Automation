package comobsqura.TestingNGframework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table extends Base
{
@Test
public void tableSample()
{
	List<String> nameList = new ArrayList<String>();
	driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
	WebElement tableLocate = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	List <WebElement> tableHeader = tableLocate.findElements(By.xpath("//th[contains(@class,'sorting_disabled')]"));
	int rowSize =  tableHeader.size();
	for (WebElement tabeltext : tableHeader)
	{
		tabeltext.getText();
	}
	List<WebElement> tableColumn = tableLocate.findElements(By.xpath("//tr[@class]"));
	int columnSize = tableColumn.size();
	
	WebElement name = driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
	boolean Name = name.isDisplayed();
	for(WebElement names : tableColumn)
	{
		String tableName = names.getText();
		nameList.add(tableName);
	}

	assertTrue(Name,"Ashton Cox Not in table  ");
	}

}


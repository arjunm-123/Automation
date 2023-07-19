package comobsqura.TestingNGframework;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MenuOptions extends Base
{
	@Test
public void Webelements(String menucategory)
{

	List<WebElement> menu = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
	for (WebElement menuoption :menu)
{
	String menutext = menuoption.getText();
	if(menutext.equals(menutext));
	{
		menuoption.click();
		break;
	
}
}
}
	@Test
public void verifySeleniumDevLanguage()
{
		String language="Português (Brasileiro)";
		driver.navigate().to("https://www.selenium.dev/");
		
		List<WebElement> languageButton = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='dropdown']//child::a[@class='nav-link dropdown-toggle']"));
		dropdown.click();
		for (WebElement languageButtionOption : languageButton)
		{
			String menutext = languageButtionOption.getText();
			if(languageButton.equals(language));
			{
				languageButtionOption.click();
				break;
			}
			
	
}
  }
}



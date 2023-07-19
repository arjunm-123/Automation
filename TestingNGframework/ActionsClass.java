package comobsqura.TestingNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Base
{
	@Test
public void actionsSample()
{
	driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	WebElement dragbleNZero = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(dragbleNZero).click();
	actions.moveToElement(dragbleNZero).build().perform();
	actions.doubleClick(dragbleNZero).perform();
	actions.contextClick(dragbleNZero).perform();
	WebElement destination = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(dragbleNZero, destination).build().perform();
}

	
}

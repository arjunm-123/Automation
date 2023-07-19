package comobsqura.TestingNGframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TimeLimit  extends Base
{
	@Test
public void locateBYId()//(6851)
{
	WebElement enterMessage = driver.findElement(By.id("single-input-field"));
}
	@Test
public void locateByClass()//(6828ms)
{
	WebElement enterMessage = driver.findElement(By.className("form-control"));
}
	@Test
public void locateBycssSelector()//(7023)
{
	WebElement eneterMessage = driver.findElement(By.cssSelector("input.form-control"));
}
	@Test
public void locateByXpath()//(5932)
{
	WebElement enterMessage = driver.findElement(By.xpath("//input[@id='single-input-field']"));
}
}

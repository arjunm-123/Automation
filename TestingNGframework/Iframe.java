package comobsqura.TestingNGframework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Iframe extends Base

{@Test
public void iFrame()
{
	driver.navigate().to("https://demo.guru99.com/test/guru99home/");
	int size = driver.findElements(By.tagName("iframe")).size();
	// using index driver.switchTo().frame(2);
	driver.switchTo().frame("a077aa5e");
	
}
}

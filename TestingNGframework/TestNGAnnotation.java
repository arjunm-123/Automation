package comobsqura.TestingNGframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation
{
@Test
public void testCase1()
{
	System.out.println("Testcase1");
}
	
@Test
public void testCase2()
{
	System.out.println("Testcase2");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("BeforeMethod");
}
@AfterMethod
public void aeforeMethod()
{
	System.out.println("AfterMethod");
}
@AfterClass
public void afterClass()
{
	System.out.println("AfterClass");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("BeforeClass");
}
@BeforeTest
public void beforeTest()
{
	System.out.println("BeforeTest");

}
@AfterTest
public void afterTest()
{
	System.out.println("AfterTest");
}
@BeforeSuite
public void beforeSuite()
{
	System.out.println("BeforeSuite");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("AfterSuite");
}
}


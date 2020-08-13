package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebloginHomerLoan()
	{
		
		//selenium
		
		System.out.println("Web login Home");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("the before method is executing");
	}
	

	@Test
	public void MobileloginHomeLoan()
	{
		
		//Appium
		System.out.println("Mobile login Homeloan");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite for daay4");
	}
	@Test
	public void APImonitor()
	{
		
		//rest API automation
		System.out.println("Rest api home loan");
	}
	@Test
	public void APIparkeLoan()
	{
		
		//rest API automation
		System.out.println("Rest api home loan");
	}
	@Test
	public void APIHomeLoan()
	{
		
		//rest API automation
		System.out.println("Rest api home loan");
	}
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("the test suite in day4 method.");
	}
	
	
}

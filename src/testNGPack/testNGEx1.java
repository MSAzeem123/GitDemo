package testNGPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGEx1 {
	
	@BeforeClass
	public void firstbeforeclass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void firstafterclass()
	{
		System.out.println("after class");
	}
	
	@Test(dependsOnMethods = {"WDemo3"})
	public void Demo3()
	{
	System.out.println("from testNGEx1");
	}
	
	@Test
	public void WDemo3()
	{
	System.out.println("from testNGEx1");
	}
	
	@Parameters({"URL"})
	@Test
	public void WDemo4(String Urlsite)
	{
	System.out.println("from testNGEx1");
	System.out.println(Urlsite);
	}
	
	@Test(enabled=false)
	public void XDemo3()
	{
	System.out.println("from testNGEx1");
	}
	
	
	@Test(groups="Smoke")
	public void Demo4()
	{
	System.out.println("from testNGEx1 - from Smoke");
	}
	
	@BeforeSuite
	public void firstbeforesuite()
	{
		System.out.println("I am No.1");
	}
	
	@AfterSuite
	public void firstaftersuite()
	{
		System.out.println("I am No.1 from last");
		
	}
	
	@AfterMethod
	public void firstaftermethod()
	{
		System.out.println("after method");
	}
	
	@BeforeMethod
	public void firstbeforemethod()
	{
		System.out.println("before method");
	}

}

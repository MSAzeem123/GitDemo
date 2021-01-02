package testNGPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class testNGEx2 {
	
	
	@Test
	public void webLoginCarloan()
	{
		System.out.println("from Web Login");		
	}
	
	//@Parameter({"URL"})
	@Test
	public void mobileLoginCarloan()
	{
		System.out.println("from mobile login");
		System.out.println("");
	}
	
	@Test
	public void apiLoginCarloan()
	{
		System.out.println("from API login");
	}
	
	@BeforeTest
	public void firstexecution()
	{
		System.out.println("I am at first place");
	}
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I am at last place");
	}

}

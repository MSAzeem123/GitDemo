package testNGPack;

import org.testng.annotations.Test;

public class testNGEx {
	
	@Test(groups="Smoke")
	public void demo()
	{		
		System.out.println("Hi-From Smoke");
	}
	
	@Test
	public void demo1()
	{
		System.out.println("Hello");
	}

}

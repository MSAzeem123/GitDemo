package Package2;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Spicejet {

	private static final Object True = null;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("WebDriver.Chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		//=========================================================================
		/*
		 * Select s = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * Thread.sleep(3000L); s.selectByValue("AED");
		 * System.out.println(driver.findElement(By.id(
		 * "ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));
		 * s.selectByIndex(1); System.out.println(driver.findElement(By.id(
		 * "ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));
		 * s.selectByVisibleText("USD"); System.out.pri
		 *System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getAttribute("value"));
		*/
		//========================================================================
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		//Parent child relationship usage for finding the element
		//driver.findElement(By.xpath("//td[@class='mapbg'] //a[@text='Bengaluru (BLR)']")).click();
		
		//========================================================================
		//Check box,Assertion
		Thread.sleep(3000);
		
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//Assert.assertEquals(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected(), "true");
		
		
		
		//Calender selection	
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
	}

}

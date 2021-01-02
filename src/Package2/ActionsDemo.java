package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class ActionsDemo {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		//driver.findElement(By.className("span[class='nav-line-2 ']")).click();
		
		
		Actions a = new Actions(driver);
		
		//Use of Key down, Entering Capital Letters, Selecting the entered letters, left mouse click for drop down in sing line
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("helllloooo").doubleClick().contextClick().build().perform();
		
		driver.findElement(By.cssSelector("//span[contains(@class,'nav-line-2 ')]")).click();
		
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
		
	
		
		
		

	}

}

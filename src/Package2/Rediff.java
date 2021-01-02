package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:\\rediff.com");
		
		driver.findElement(By.cssSelector("#signin_info > a.signin")).click();  //usage regular expression in css selector
		
		driver.findElement(By.cssSelector("#login1")).sendKeys("Hi"); //usage of css selector
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("abc"); //usage of regular expression xpath
		
		driver.findElement(By.cssSelector("input[name*='proce']")).click(); //usage of regular expression in css selector

	}

}

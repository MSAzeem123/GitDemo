package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("(\"//div[@class='grid-tile-container']\")[2]")).click();
		
		

	}

}

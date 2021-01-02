package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("MUM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@text='Mumbai, India']")).click();
		//driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ENTER);
		

	}

}

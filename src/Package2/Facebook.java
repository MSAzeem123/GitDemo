package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http:\\facebook.com");
		
		//driver.findElement(By.id("email")).sendKeys("Hey");
		
		//driver.findElement(By.id("pass")).sendKeys("Hello");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hi Xpath");
		//driver.findElement(By.cssSelector(""))
		
		//driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Hello xpath");
		
		//driver.findElement(By.linkText("Forgot account?")).click();				
		//driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		//------------------------------------------------------------------------
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("sdfas");
		
		driver.findElement(By.cssSelector("#Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		

	}

}

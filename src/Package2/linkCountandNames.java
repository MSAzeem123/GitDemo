package Package2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCountandNames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		 WebElement  footDriver = driver.findElement(By.id("gf-BIG"));
		 
		 System.out.println(footDriver.findElements(By.tagName("a")).size());
		 
		 WebElement colDriver = footDriver.findElement(By.xpath("//div/table/tbody/tr/td[1]"));
		 
		 System.out.println(colDriver.findElements(By.tagName("a")).size());
		
		 
		 for(int i=1; i<(colDriver.findElements(By.tagName("a")).size()); i++)
		 {
			 String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);  //create one object of multiple key board actions
			 
			 colDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);  //send these actions to click on multiple links
			 Thread.sleep(3000L);
		 }
		 
		 Set<String> wid = driver.getWindowHandles();  //get all the window handles and store them in set
		 
		 Iterator<String> it = wid.iterator();  //use iterator  to navigate between the windows
		 
		 while(it.hasNext())  // use while loop till you navigate all the windows and then stop
		 {
			 driver.switchTo().window(it.next());  //switch when you have next window
			 System.out.println(driver.getTitle());  //print the title of each window
		 }
		 
			
		 		
	
	}

		
	}

	


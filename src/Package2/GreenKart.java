package Package2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
		//add implicitly wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
		String[] itemList = {"Cucumber", "Beetroot", "Tomato", "Beans", "Mango", "Pista"};
		
		List<WebElement> Products = driver.findElements(By.cssSelector("h4.product-name"));
		int i,j;
		j = 0;
		for(i=0; i<Products.size();i++)
		{			
			String[] itemName = Products.get(i).getText().split("-");
			String formateditemName = itemName[0].trim();
			
			//convert the array to array list for easy search
			//check whether the extracted name from application is exist in array
			List itemNeededList = Arrays.asList(itemList);  
			
			if (itemNeededList.contains(formateditemName)) 
			{		
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==itemList.length)
					break;
			}		
		} 
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");

		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		WebDriverWait W = new WebDriverWait(driver,5);
		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		

	}
}
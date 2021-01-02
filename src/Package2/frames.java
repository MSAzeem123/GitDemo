package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/?ref=gw_intl_in&pf_rd_r=AHMPT356S7SYAZHGE73N&pf_rd_p=e1353056-e95c-4f75-8e78-0cfaa52ee26f");
		
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//assignment to print "middle" text from application to in output
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");  //invoke the application
		
		//System.out.println((driver.findElements(By.tagName("frame")).size()));  //to know the number of frames
		
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));  //First switch to Parent frame
		
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));  //then switch to child frame
		
		System.out.println(driver.findElement(By.id("content")).getText());  //get the text from frame
		
		
		
	}

}

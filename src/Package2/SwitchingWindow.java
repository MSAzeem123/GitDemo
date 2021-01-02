package Package2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Terms")).click();
		
		Set<String>ids = driver.getWindowHandles(); //get the all window handles of opend tabs or windows
		
		Iterator<String>it = ids.iterator();  //use iterator to iterate between the windows
		
		String Parentid = it.next(); //save the window handle of parent window
		
		String Childid = it.next();  //save the window handle of child window
		
		driver.switchTo().window(Childid);  //switch from parent window to child window
		
		System.out.println(driver.getTitle());  //do required operation
		
		driver.switchTo().window(Parentid);  //switch back to parent window
		
		System.out.println(driver.getTitle());  // do the required actions
		
		
		
	}

}

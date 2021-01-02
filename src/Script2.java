import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.firefox.driver", "F:\\Year2020\\Java2020\\geckodriver.exe");		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:\\Google.com");
		//Get Title
		System.out.println(driver.getTitle());
		//Get Current URL
		System.out.println(driver.getCurrentUrl());
		//Get Page Source
		//System.out.println(driver.getPageSource());
		//Get Window Handler
		System.out.println(driver.getWindowHandle());
		
		//Navigate to other browser
		driver.navigate().to("http:\\yahoo.com");
		
		//Navigate to back
		driver.navigate().back();
		
		//Navigate to forward
		driver.navigate().forward();
		
		//Close the browser
		driver.close(); //closes current window
		driver.quit(); //closes all the windows child and parent
		
	}

}

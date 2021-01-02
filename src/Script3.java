import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Script3 {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.ie.driver", "F:\\Year2020\\Java2020\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) {
		//set the chrome driver
		System.setProperty("webdriver.chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://google.com");
		System.out.println(Driver.getTitle());

	}

}

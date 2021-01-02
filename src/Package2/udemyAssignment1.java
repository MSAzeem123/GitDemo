package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class udemyAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.driver", "F:\\Year2020\\Java2020\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//invoke application
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		//driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]/input")).click();
		driver.findElement(By.id("checkBoxOption1")).click();  //select the check box
		
		String checkboxName = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();  //get the checkbox text

		//String checkboxName = driver.findElement(By.tagName("lable")).getAttribute("name");
		//div[@id='checkbox-example']/fieldset/label[1]/input
		//div[4]//fieldset[1]//label[1]//input[1]
		
		System.out.println(checkboxName);  //print the checkbox name
		
		
		//Select webDropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		WebElement webDropDown = driver.findElement(By.id("dropdown-class-example"));  //create a webelement object of dropdown
		Select s = new Select(webDropDown); 
		
		s.selectByVisibleText(checkboxName);  //select the option
		
		driver.findElement(By.id("name")).sendKeys(checkboxName);  //print the option in edit box
		Thread.sleep(3000L);
		
		driver.findElement(By.xpath("//div//div[3]//input[2]")).click(); //click on alert button
		
		String alertText = driver.switchTo().alert().getText();  //switch to alert window
		
		if (alertText.contains(checkboxName))		//check if alert message contains the selected option
			System.out.println("Selected option is present.");		
		else		
			System.out.println("Some thing is wrong.");
				
		driver.switchTo().alert().accept();  //close the alert box
				
	}

}

package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sendKeys_Command_of_Alert_interface {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing the Browser.
		driver.manage().window().maximize();
		
		// Launching WebPage.
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		// Clicking on Get Prompt button.
		driver.findElement(By.id("prompt")).click();
		
		// Switch to alert window and send keys.
		driver.switchTo().alert().sendKeys("Testing");
		
		String alerttext = driver.switchTo().alert().getText();
		
		System.out.println(alerttext);
		
		Thread.sleep(3000);
		
		// Accepting the alert windows by clicking OK button.
		driver.switchTo().alert().accept();
		
		// Close the current browser.
		driver.close();
		
	}

}

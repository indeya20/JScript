package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeCommands {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizing the Browser.
		driver.manage().window().maximize();

		// Launching WebPage

		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		// Types of iframe Switch WebDriver commands:
		// 1) Switch iframe by ID
		// 2) Switch iframe by String (WebElement)
		// 3) Swithc iframe by iframe index number.
		
		// iframe switched using iframe id
		// driver.switchTo().frame("singleframe");
		
		// iframe switched using String
		
		// WebElement iframe = driver.findElement(By.id("singleframe"));
		
		// driver.switchTo().frame(iframe);		
		
		// iframe switched using iframe index number
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");

		Thread.sleep(2000);
		
		// Closing the current Browser
		driver.close();
		


	}

}

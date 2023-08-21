package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class moveToElement_Command {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing WebPage
		driver.manage().window().maximize();
		
		// Launching the WebPage
		driver.get("https://omayo.blogspot.com/");
		
		// WebElement targetted.
		WebElement blog = driver.findElement(By.id("blogsmenu"));
		
		// Action class created.
		Actions action = new Actions(driver);
		
		// Moving the cursor to the Web Element.
		action.moveToElement(blog).build().perform();
		
		Thread.sleep(3000);
		
		// Closing the current Browser.
		driver.close();

	}

}

package WebDrivercommands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrolling {

	public static void main(String[] args) throws InterruptedException {

/* Types of scrolling page:

	Scrolling by pixel

	Scrolling page till we find Element

	Scrolling page till bottom
	
	Current project : How to scroll down on a web page in Selenium by defining the number of pixels

 
 */
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");

			// Initializing WebDriver
			
			WebDriver driver = new ChromeDriver(); 
			
			String homepage = "https://www.countries-ofthe-world.com/flags-of-the-world.html";
			
			// Maximizing WebDriver
			driver.manage().window().maximize();
			
			// Visit targeted page or WebSite
			driver.get(homepage);
			
			Thread.sleep(3000);
			
			// Scrolling a page with Pixels (Down)
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,1000)");

			Thread.sleep(1000);
			
			// Scrolling a page with Pixels (Up)
			
			jse.executeScript("window.scrollBy(0,-500)");
			
			Thread.sleep(500);
			
			driver.quit();
	}

}

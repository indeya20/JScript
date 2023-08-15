package PracticeSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) throws InterruptedException {
		
		
//		How to Resize Browser Window in WebDriver?
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String homepage = "https://www.yahoo.com";
		
		// Maximize Window
		driver.manage().window().maximize();
		
		// Launch WebPage
		driver.navigate().to(homepage);
		
		// Set window Dimension
		
		Dimension dimension = new Dimension(1000, 1080);
		
		driver.manage().window().setSize(dimension);
		
		Thread.sleep(2000);
		
		// Maximzied the Window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}

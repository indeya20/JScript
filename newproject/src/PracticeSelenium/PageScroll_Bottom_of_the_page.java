package PracticeSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll_Bottom_of_the_page {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		String homepage = "https://www.countries-ofthe-world.com/flags-of-the-world.html";
		
		driver.navigate().to(homepage);
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}

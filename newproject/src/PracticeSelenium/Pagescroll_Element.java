package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagescroll_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
		
		//Initializing WebDriver
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		String homepage = "https://www.countries-ofthe-world.com/flags-of-the-world.html";

		//Launching Webpage
		
		driver.navigate().to(homepage);
		
		Thread.sleep(2000);
		
		// Locating an target element
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]"));
		
		
		jse.executeScript("arguments[0].scrollIntoView();", country);
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}

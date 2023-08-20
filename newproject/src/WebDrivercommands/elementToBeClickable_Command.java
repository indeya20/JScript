package WebDrivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementToBeClickable_Command {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the Web Browser.
		driver.manage().window().maximize();
		
		// Launch WebPage
		driver.get("https://omayo.blogspot.com/");
		
		String title = driver.getTitle();
		
		// Print the title of the page.
		System.out.println(title);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		// Click on Check this button.
		driver.findElement(By.xpath("//button[normalize-space()='Check this']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dte"))).click();
		
		
		Thread.sleep(4000);
		
		// Closing Browser
		driver.close();
		

	}

}

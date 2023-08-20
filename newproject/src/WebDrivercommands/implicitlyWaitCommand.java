package WebDrivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitlyWaitCommand {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing WebBrowser
		driver.manage().window().maximize();
		
		// Set implicit wait time. 
		// Please not the implicit wait time applies to all elements.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Launching WebPage.
		driver.get("https://omayo.blogspot.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		// Click drop down button.
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		// Click Facebook option.
		driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
		
		// Navigate back
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		// Closing the current Browser
		driver.close();
		
	}

}

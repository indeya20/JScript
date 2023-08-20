package WebDrivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class until_and_visibilityOfElementLocated_Commands {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing Browser window
		driver.manage().window().maximize();
		
		// Launching WebPage
		driver.get("https://omayo.blogspot.com/");
		
		String title1 = driver.getTitle();
		
		System.out.println(title1);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
		
		Thread.sleep(2000);
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		
		// Navigating the driver back
		driver.navigate().back();
		
		String maintitle = driver.getTitle();
		
		System.out.println(maintitle);
		
		// Close WebDriver
		driver.close();
		
		
		

	}

}

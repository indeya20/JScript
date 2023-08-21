package WebDrivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertIsPresent_Command {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		//Maximize WebBrowser.
		driver.manage().window().maximize();

		// Launching WebPage.
		driver.get("https://omayo.blogspot.com/");

		// Click get alert button.
		driver.findElement(By.id("alert1")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.alertIsPresent());
		
		String alert = driver.switchTo().alert().getText();
		
		System.out.println(alert);
		
		Thread.sleep(2000);

		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);

		//  Close current Browser WebPage.
		driver.close();

	}

}

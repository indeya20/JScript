package WebDrivercommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invisibilityOfElementLocatedCommand {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing the Browser window.
		driver.manage().window().maximize();
		
		// Launching WebPage.
		driver.get("https://omayo.blogspot.com/");
		
		
		String Text = driver.findElement(By.id("deletesuccess")).getText();
		
		// Print text
		System.out.println(Text);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("deletesuccess")));
		
		driver.findElement(By.id("alert2")).click();
		
		String alerttext = driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		// Print Alert Text
		System.out.println(alerttext);
		
		Thread.sleep(2000);
		
		// closing current Browser.
		driver.close();
		
		
		

	}

}

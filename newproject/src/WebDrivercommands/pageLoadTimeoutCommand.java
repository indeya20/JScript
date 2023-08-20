package WebDrivercommands;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageLoadTimeoutCommand {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizing Browser window.
		driver.manage().window().maximize();

		// Page timeout setting.		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));


		// Launching the WebSite.
		driver.get("https://colabus.com/");

		String title = driver.getTitle();

		System.out.println(title);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Closing the current Browser.
		driver.close();
	}

}

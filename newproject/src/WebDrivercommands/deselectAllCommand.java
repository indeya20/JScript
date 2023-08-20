package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deselectAllCommand {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizing the Browser Window
		
		driver.manage().window().maximize();
		
		// Launching the WebPage
		driver.get("https://omayo.blogspot.com/");
		
		WebElement multiselectionbox = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectionbox);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select.deselectAll();
		
		Thread.sleep(2000);
		
		// Closing the current Browser.
		
		driver.close();
		

	}

}

package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deselectByVisibleText {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing window
		driver.manage().window().maximize();
		
		// Launch WebPage
		driver.navigate().to("https://omayo.blogspot.com/");
		
		WebElement multiselectiobox = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectiobox);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		// Closing the current Browser.
		
		driver.close();

	}

}

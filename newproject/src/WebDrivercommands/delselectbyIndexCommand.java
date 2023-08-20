package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delselectbyIndexCommand {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing the Browser window
		driver.manage().window().maximize();
		
		// Launching the WebPage
		driver.navigate().to("https://omayo.blogspot.com/");
		
		WebElement multiselectbox = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiselectbox);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Swift");
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		select.deselectByIndex(2);
		
		Thread.sleep(2000);
		
		// Closing the current browser window
		
		driver.close();
		
		

	}

}

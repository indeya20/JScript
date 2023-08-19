package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectVisibleText {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize the Browser window

		driver.manage().window().maximize();

		String homepage = "https://omayo.blogspot.com/";

		// Launch Website
		driver.navigate().to(homepage);

		Thread.sleep(1000);

		WebElement dropdown = driver.findElement(By.id("drop1"));

		Select select = new Select(dropdown);

		select.selectByVisibleText("doc 3");


		Thread.sleep(1000);

		WebElement list = driver.findElement(By.id("multiselect1"));

		Select select1 = new Select(list);

		select1.selectByVisibleText("Audi");
		Thread.sleep(3000);

		// Close the current browser window
		driver.close();

	}

}

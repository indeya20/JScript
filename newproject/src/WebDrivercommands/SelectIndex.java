package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectIndex {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize the page

		driver.manage().window().maximize();

		String homepage = "https://omayo.blogspot.com/";

		// Launch WebPage
		driver.navigate().to(homepage);

		WebElement Dropdownfield = driver.findElement(By.id("drop1"));

		Select select = new Select(Dropdownfield);

		Thread.sleep(2000);

		select.selectByIndex(3);

		Thread.sleep(1000);

		WebElement Multiselectiondropdown = driver.findElement(By.id("multiselect1"));

		Select select1 = new Select(Multiselectiondropdown);

		select1.selectByIndex(3);

		Thread.sleep(1000);

		// Close the current Browser window

		driver.close();


	}

}

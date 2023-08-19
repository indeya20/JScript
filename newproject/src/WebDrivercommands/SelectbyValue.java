package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectbyValue {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizing the Web Browser.

		driver.manage().window().maximize();

		String homepage = "https://omayo.blogspot.com/";

		// Launching the site.

		driver.navigate().to(homepage);

		Thread.sleep(2000);

		// Targetting the dropdownlist using ID.

		WebElement 	dropdownlistfield = driver.findElement(By.id("drop1"));

		Select selectdropdownlist = new Select(dropdownlistfield);

		// Selecting dropdown by targetting it's value.

		selectdropdownlist.selectByValue("jkl");

		Thread.sleep(2000);

		WebElement	multiselectionlist = driver.findElement(By.id("multiselect1"));
		
		Select multiselect = new Select(multiselectionlist);
		
		multiselect.selectByValue("swiftx");
		
		Thread.sleep(2000);


		// Close current browser.

		driver.close();


	}

}

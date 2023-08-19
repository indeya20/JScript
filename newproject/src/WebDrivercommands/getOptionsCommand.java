package WebDrivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getOptionsCommand {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize the Browser window

		driver.manage().window().maximize();

		// Launch webPage
		driver.navigate().to("https://omayo.blogspot.com/");

		WebElement dropdownlist = driver.findElement(By.id("drop1"));

		Select dropdown = new Select(dropdownlist);

		List <WebElement> options = dropdown.getOptions();

		for (WebElement option : options) {

			System.out.println(option.getText());
		}

		Thread.sleep(2000);

		WebElement mutiselectionlist = driver.findElement(By.id("multiselect1"));

		Select multiselection = new Select(mutiselectionlist);

		List <WebElement> options1 = multiselection.getOptions();

		for(WebElement option : options1) {

			System.out.println(option.getText());

		}


		// Close current browser
		driver.close();


	}

}

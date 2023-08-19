package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isMutiplecommand {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize Broswer window.
		driver.manage().window().maximize();

		// Launch WebPage

		driver.navigate().to("https://omayo.blogspot.com/");

		// Target WebElement

		WebElement dropdown = driver.findElement(By.id("drop1"));
		
		Select selectdropdown = new Select(dropdown);
		
		System.out.println(selectdropdown.isMultiple()); // This will print False because the drop down list allows only one selection.
		
		
		WebElement	mutipleselectionlist = driver.findElement(By.id("multiselect1"));
		
		Select multipleselect = new Select(mutipleselectionlist);
		
		System.out.println(multipleselect.isMultiple());   // This will print True because it allows multiple items selection.
		
		// Closing the current browser.
		
		driver.close();		
		

	}

}

package WebDrivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getFirstSelectedOption {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize Browser Window

		driver.manage().window().maximize();

		// Launch WebPage

		driver.navigate().to("https://omayo.blogspot.com/");

		WebElement	multiselectionlist = driver.findElement(By.id("multiselect1"));

		Select multiselection = new Select(multiselectionlist);

		multiselection.selectByVisibleText("Audi");
		multiselection.selectByVisibleText("Volvo");
		multiselection.selectByVisibleText("Hyundai");


		// Print only first option from the multiple selection box.

		WebElement select1 = multiselection.getFirstSelectedOption();

		System.out.println("Printed first option from multiselection list :");

		System.out.println(select1.getText());

		WebElement	multiselections = driver.findElement(By.id("multiselect1"));

		Select multiselected = new Select(multiselections);

		multiselected.selectByVisibleText("Audi");
		multiselected.selectByVisibleText("Volvo");
		multiselected.selectByVisibleText("Hyundai");

		// The following code will print multiple selected options from multiple selection box.

		List <WebElement> selects = multiselected.getAllSelectedOptions();

		// To print a line space between First Selected and All Selected Options.
		System.out.println(); 
		
		System.out.println("Printed all selected option from multiselection list :");
		
		for (WebElement select: selects) {

			System.out.println(select.getText());			
		}


		Thread.sleep(2000);

		// Closing the current browser

		driver.close();		


	}

}

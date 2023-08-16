package WebDrivercommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElementsCommand {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize window
		driver.manage().window().maximize();
		
		String homepage ="https://demoqa.com/buttons";
		
		// Launch WebPage
		driver.navigate().to(homepage);
		
		
		List <WebElement> elements = driver.findElements(By.xpath("//button"));
		
		for (WebElement element : elements) {
		
			System.out.println(element.getText());
		}
		
		//Closing the browser
		driver.close();	

	}

}

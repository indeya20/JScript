package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding_Location_of_a_WebElement {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize the window
		driver.manage().window().maximize();
		
		String homepage = "https://demoqa.com/text-box";  // URL here
		
		// Navigate to WebPage
		driver.navigate().to(homepage);
		
		Point point = driver.findElement(By.id("permanentAddress")).getLocation();
		
		System.out.println("The X co-ordinate position is : "+ point.x +" The Y co-ordinate position is : "+point.y);
		
		Thread.sleep(2000);
		
		driver.quit(); // The command Quit browser window
		
		
		

	}

}

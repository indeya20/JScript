package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getCSSValueCommand {

	public static void main(String[] args) throws Exception  {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		// Maximizing browser Window
		driver.manage().window().maximize();
		
		String homepage = "https://demoqa.com/text-box";
		
		// Launching WebPage
		driver.navigate().to(homepage);
		
		// Find element
		String lineheight = driver.findElement(By.xpath("//button[@id='submit']")).getCssValue("line-height");
		
		// Print line-height of the button.
		System.out.println(lineheight);
		
		// Remember the answer will be in Pixel ( For instance if you see line - height as 1.5, in Dev tools and your answer is 24px it means ( 16 * 1.5) = 24px
		
		Thread.sleep(1000);
		
		// Close Browser
		driver.close();
		
		
	}

}

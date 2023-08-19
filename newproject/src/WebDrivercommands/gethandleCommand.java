package WebDrivercommands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gethandleCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizing browser Window
		driver.manage().window().maximize();

		String homepage ="https://demo.automationtesting.in/Windows.html";

		// Launching WebPage
		driver.navigate().to(homepage);

		Thread.sleep(3000);
		
		// Open a New Seperate window
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		
		
		String firstwindow = driver.getWindowHandle();		

		Thread.sleep(3000);
		
		// Clicking on Popup Window
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


		Set<String> windows = driver.getWindowHandles();

		Iterator<String> itr = windows.iterator();

		while(itr.hasNext()) {

			String window = itr.next();

			driver.switchTo().window(window);

			

			if(driver.getTitle().equals("Selenium")) {

				driver.close();
				
				

			}


		}
		
		driver.switchTo().window(firstwindow);
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		
		Thread.sleep(1000);		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Welcome");
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}

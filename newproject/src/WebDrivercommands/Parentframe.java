package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parentframe {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize Web Browser
		driver.manage().window().maximize();


		// Launch WebPage
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_frameborder");

		driver.switchTo().frame("iframeResult");

		driver.switchTo().frame(0);

		String childframeop = driver.findElement(By.xpath("//h1[normalize-space()='This page is displayed in an iframe']")).getText();

		System.out.println(childframeop);
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		String Maintext = driver.findElement(By.xpath("/html/body/p")).getText();

		System.out.println(Maintext);
		
		
		// Closing the browser
		driver.close();




	}

}

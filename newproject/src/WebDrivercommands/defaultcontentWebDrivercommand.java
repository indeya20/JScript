package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class defaultcontentWebDrivercommand {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();


		// Maximizing the Browser Window.
		driver.manage().window().maximize();

		// Launching the WebPage.
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_frameborder");
		
		// Switch to Parent iframe.
		driver.switchTo().frame("iframeResult");
		
		// Switch to child iframe.
		driver.switchTo().frame(0);

		String childframetext = driver.findElement(By.xpath("/html/body/h1")).getText();
		
		// Print iframe content.
		System.out.println(childframetext);
		
		
		// Switch to default content of the WebPage.
		driver.switchTo().defaultContent();
		
		// Switch to Parent iframe.
		driver.switchTo().frame("iframeResult");
		
		String maincontent = driver.findElement(By.xpath("/html/body/h2")).getText();
		
		// Print parent iframe results.		
		System.out.println(maincontent);
		
		// Closing the current Browser
		driver.close();	


	}

}

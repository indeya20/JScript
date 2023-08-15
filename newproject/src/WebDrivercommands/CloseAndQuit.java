package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Browser Command:
//----------------
//close() - Closes current window.
//quit() - Closes Mutiple windows of a browser.

public class CloseAndQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// Example : 1
		
		//driver.get("https://www.webroot.com/services/popuptester1.htm");
		//driver.close(); // Close single browser window.
		//driver.quit(); // Close All browser windows. Including popup's
		
		
		// Example : 2
		
		driver.get("https://www.parasoft.com/products/");
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/a/p/span")).click();
		//driver.close();
		//driver.quit();
	}

}

package FirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rafeeq.Hussain\\eclipse\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/"); // Open the URL on CG browser
		driver.manage().window().maximize(); // Maximized the window
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user"); // Enter user name
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); // Enter password
		driver.findElement(By.name("login-button")).click(); // Click login button
		
		
		String exp_title=("Swag Labs"); // Expected title
				
		String act_title=driver.getTitle(); // Actual title
		
		System.out.println(act_title); // To print actual title.
		
		
		if (exp_title.equals(act_title)==true)
		{
			System.out.println("Test is passed");
						
		}
		
		else
		{
			System.out.println("Test is failed");
		}
				
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();  // To close browser
	}
}

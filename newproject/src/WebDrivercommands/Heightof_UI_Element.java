package WebDrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Heightof_UI_Element {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		String homepage = "https://demoqa.com/text-box";

		// Navigate to URL
		driver.navigate().to(homepage);

		Dimension dimensions = driver.findElement(By.xpath("//input[@id='userName']")).getSize();
		System.out.println("Height :" + dimensions.height + "Width : "+ dimensions.width);


		/*
		 What is the use of Thread.sleep() ?
		 
		 The Java Thread.sleep() method can be used to pause the execution of the current thread for a specified time in milliseconds. 

		 How Thread.sleep Works?

		 Thread.sleep() interacts with the thread scheduler to put the current thread in a wait state for a specified period of time.
		 
		 Once the wait time is over, the thread state is changed to a runnable state and waits for the CPU for further execution.
		 */

		Thread.sleep(2000);


		driver.quit();

			
			
		
		
	}

}

package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//open url application
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Fill username
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//Fill password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click to login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Validation enter on home page
		
		//Close browser
		//driver.close();
		//Kill session
		driver.close();
		
		
		
		
		
			
			
	}

}

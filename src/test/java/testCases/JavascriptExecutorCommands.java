package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		
		WebElement btnClickMe = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Click();", btnClickMe);
		
		
	}

}

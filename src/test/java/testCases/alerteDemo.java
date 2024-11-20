package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.manage().window().minimize();
		
		driver.manage().deleteAllCookies();
	
		driver.get("https://demoqa.com/alerts");
		WebElement btnClickMe = driver.findElement(By.id("alertBouton"));
		btnClickMe.click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		driver.quit();
		
		

	}

}

package testCases;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class doubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//Open browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().minimize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		
		//Intantiate actions class
		
		Actions action = new Actions(driver);
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		Actions.doubleClick(btnDoubleClick).perform();
		
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(text, "You have done a dynamic click");
		
		driver.quit();
	}

}

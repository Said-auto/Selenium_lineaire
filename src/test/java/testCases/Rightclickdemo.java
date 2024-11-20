package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Rightclickdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate Actions class 
		Actions actions = new Actions(driver);
		
		WebElement btnRightClick = driver.findElement(By.id("RightClickBtn"));
		actions.contextClick(btnRightClick).build().perform();
		
		String text = driver.findElement(By.id("RoubleClickMessage")).getText();
		Assert.assertEquals(text, "You have done a double click");
		
		driver.quit();

	}

}

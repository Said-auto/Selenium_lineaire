package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class LoginSwagLabEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new EdgeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate Actions class 
		Actions actions = new Actions(driver);
		
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(btnDoubleClick).build().perform();
		
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(text, "You have done a double click");
		
		driver.quit();

	}

}

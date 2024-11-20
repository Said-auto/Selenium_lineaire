package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginSwagLabs {

	public static void main(String[] args) {
		
		// open chrome browser
				WebDriver driver = new ChromeDriver();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				// Maximize Browser
				driver.manage().window().minimize();
				
				// Delete cookies
				driver.manage().deleteAllCookies();
				
				// Open url application
				driver.get("https://www.saucedemo.com/");
				
				// Fill username
				WebElement username = driver.findElement(By.name("user-name"));
				username.clear();
				username.sendKeys("standard_user");
				
				
				// Fill password
				WebElement password = driver.findElement(By.name("password"));
				password.clear();
				password.sendKeys("standard_user");
				
				
			    // Click on login button using Explicite Wait
				WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
				WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login-button")));
				loginBtn.click();
				
				// Validation enter to home page
				String textProduct = driver.findElement (By.xpath("")).getText();
				Assert.assertEquals(textProduct, "Products");
				
				// Print screen message
				System.out.println("Login successfully");
				
				//driver.quit

	}

}

package testCases;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CalculatorDemo {

	public static void main(String[] args, Object wait) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://juliemr.github.io/protractor-demo/");
		driver.findElement(By.xpath("")).sendKeys("5");
		driver.findElement(By.xpath("")).sendKeys("4");
		driver.findElement(By.xpath("")).click();
		
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		WebElement result = driver.findElement(By.tagName("h2"));
		System.out.println("The result is: "+result.getText());
		
		driver.quit();
		

	}

}

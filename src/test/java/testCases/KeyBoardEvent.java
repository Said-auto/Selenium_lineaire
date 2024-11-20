package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAdress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		
		fullName.sendKeys("Hedia Ghezaoui");
		email.sendKeys("hdia.a@gmc.com");
		currentAdress.sendKeys("France");
		
		//Copy Past
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAdress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAddress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		btnSubmit.click();
		
		//driver.quit(); 
		

	}

}

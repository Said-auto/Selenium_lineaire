package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().window().minimize();

		driver.manage().deleteAllCookies();

		driver.get("https://www.rediff.com/");
		
		
        driver.switchTo().frame("moneyiframe");
		WebElement option = driver.findElement(By.id("nseindex"));

		String test = option.getText();

		System.out.println("The value"  + test);

	}

}

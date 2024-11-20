package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhttps://demoqa.com/tool-tips/");
		WebElement btnHoverMeToSee = driver.findElement(By.id("tooTipButton"));
		String tooltipText = btnHoverMeToSee.getText();
		
		if(tooltipText.equals("Hover me to see")) {
			System.out.println("Pass: tooltip matching expected value");
		}
		else {System.out.println("Fail: tooltip is not  matching expected value");
		
	}
		
	driver.quit();
		
	}		

}
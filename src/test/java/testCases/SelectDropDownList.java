package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement.selectMenu = driver.findElement(By.id("oldSelectMenu"));
		Select dropDownList = new Select(selectMenu);
		
		//Select By index
		dropDownList.selectByIndex(3);
		//Select By value
		dropDownList.selectByValue("4");
		//Select By visible text
		dropDownList.selectByVisibleText(white);
				
		

	}

}
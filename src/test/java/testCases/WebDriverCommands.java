package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser
		driver.manage().window().maximize();
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		
		// Delete cookies
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();
		int lengthTitle = title.length();
		System.out.println("The Title is :" +title);
		System.out.println("The legth of title is :" +lengthTitle);
		
		String actuelUrl = driver.getCurrentUrl();
		if (actuelUrl.equals(url)) {
			System.out.println("Verification Successfull - the correct url is opened");
		} else {
			System.out.println("Verification failed - incorrect url is opened");
	}
		System.out.println(actuelUrl);
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		int lengthpageSource = pageSource.length();
		
		System.out.println(lengthpageSource);
		driver.quit();

}
}

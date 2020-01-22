package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	static String browser;
	static WebDriver driver;
	
	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
	}


	public static void setBrowser() {
		browser="Chrome";
	}

	public static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");
		
		if(browser.contains("Firefox")) {
		System.setProperty("webdriver.geco.driver", projectLocation+"\\lib\\gecodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.exe", "C:\\Program Files\\Mozilla Firefox");
		driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
			
		}
		
		if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		}
}
	public static void runTest() {
		driver.get("https://google.com/");	
		driver.quit();
	}
	
}



package stepglue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_H2A.09.22\\Desktop\\Selenium Browsers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_H2A.09.22\\Desktop\\Selenium Browsers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			
			return new InternetExplorerDriver();
		}
		else {
			return null;
		}
	}

}

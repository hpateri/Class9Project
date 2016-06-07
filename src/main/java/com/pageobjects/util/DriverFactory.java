package com.pageobjects.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverFactory {
	
	private static WebDriver driver;
	static String browser = System.getProperty("browser");
	
	public static WebDriver getDriver() {
		
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if (browser.equals("iexplorer")) {
			System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	
	public static void captureScreenshot(WebDriver driver, String testName) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshots/" + testName + ".png"));
		
		
	}

}

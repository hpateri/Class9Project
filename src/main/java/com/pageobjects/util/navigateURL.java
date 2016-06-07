package com.pageobjects.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class navigateURL {

	static String appURL = System.getProperty("URL");
	
	public static String goToUrl() {
		if(appURL.equals("production")) {
			appURL = "http://www.newtours.demoaut.com";
		}
		
		else if (appURL.equals("development")) {
			appURL = "http://www.dev-newtours.demoaut.com";
		}
		
		else if (appURL.equals("development")) {
			appURL = "http://www.qa-newtours.demoaut.com";
		}
		return appURL;
	}
}

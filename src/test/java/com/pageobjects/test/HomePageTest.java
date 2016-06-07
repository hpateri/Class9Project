package com.pageobjects.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import com.pageobjects.pages.HomePage;
import com.pageobjects.util.DriverFactory;
import com.pageobjects.util.navigateURL;

public class HomePageTest {
	
	private WebDriver driver;
	private String appURL;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		appURL = navigateURL.goToUrl();
	}
	
	
	@Test
	public void testLogin() {
		driver.get(appURL);
		HomePage homePage = new HomePage(driver);
		homePage.enterUsername("mercury");
		homePage.enterPassword("mercury");
		homePage.clickSignIn();
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}

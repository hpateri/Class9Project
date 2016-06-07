package com.pageobjects.test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.pageobjects.pages.FindFlightPage;
import com.pageobjects.pages.HomePage;
import com.pageobjects.pages.SelectFlightPage;
import com.pageobjects.util.DriverFactory;
import com.pageobjects.util.navigateURL;

public class BookAFlightTest {
	
	private WebDriver driver;
	private String appURL;
	
	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
		appURL = navigateURL.goToUrl();
	}
	
	
	@Test
	public void testLogin() throws IOException {
		driver.get(appURL);
		HomePage homePage = new HomePage(driver);
		homePage.enterUsername("mercury");
		homePage.enterPassword("mercury");
		DriverFactory.captureScreenshot(driver, "homePage");
		FindFlightPage findFlightPage = homePage.clickSignIn();
		findFlightPage.selectPassenger();
		findFlightPage.selectDeparture();
		DriverFactory.captureScreenshot(driver, "findFlightPage");
		//save select flight page in SelectFlightPage object
		SelectFlightPage selectFlightPage = findFlightPage.clickContinue();
		selectFlightPage.selectOutFlight();
		selectFlightPage.selectInFlight();
		selectFlightPage.clickReserveFlights();
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}


}

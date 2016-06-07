package com.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private static String userNameCssLocator = "input[name='userName']";
	private static String passwordCssLocator = "input[name='password']";	
	private static String signInXpathLocator = "//input[@alt='Sign-In']";
	
	
	public void enterUsername(String userName) {
		driver.findElement(By.cssSelector(userNameCssLocator)).clear();
		driver.findElement(By.cssSelector(userNameCssLocator)).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.cssSelector(passwordCssLocator)).clear();
		driver.findElement(By.cssSelector(passwordCssLocator)).sendKeys(password);
	}
	
	public FindFlightPage clickSignIn() {
		driver.findElement(By.xpath(signInXpathLocator)).isDisplayed();
		driver.findElement(By.xpath(signInXpathLocator)).click();
		return new FindFlightPage(driver);
	}
	

}

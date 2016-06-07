package com.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FindFlightPage {
	
private WebDriver driver;
	
	public FindFlightPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private static String passengerCssSelector = "select[name='passCount']";
	private static String departureCssSelector = "select[name='fromPort']";
	private static String continueCssSelector = "input[name='findFlights']";
	
	
	public void selectPassenger() {
		Select element = new Select(driver.findElement(By.cssSelector(passengerCssSelector)));
		element.selectByValue("2");
	}
	
	public void selectDeparture() {
		Select element = new Select(driver.findElement(By.cssSelector(departureCssSelector)));
		element.selectByValue("London");
	}
	
	public SelectFlightPage clickContinue() {
		driver.findElement(By.cssSelector(continueCssSelector)).click();
		return new SelectFlightPage(driver);
	}
	

}

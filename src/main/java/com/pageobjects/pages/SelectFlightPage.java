package com.pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFlightPage {
	
	private WebDriver driver;
	
	public SelectFlightPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private String outFlightCssLocator = "input[value*='361']";
	private String inFlightCssLocator = "input[value*='630']";
	private String reserveFlightsLocator = "input[name='reserveFlights']";
	
	public void selectOutFlight() {
		driver.findElement(By.cssSelector(outFlightCssLocator)).click();
	}
	
	public void selectInFlight() {
		driver.findElement(By.cssSelector(inFlightCssLocator)).click();
	}
	
	public void clickReserveFlights() {
		driver.findElement(By.cssSelector(reserveFlightsLocator)).click();
	}
	

}

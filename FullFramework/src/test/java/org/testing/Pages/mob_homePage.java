package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class mob_homePage {

	AndroidDriver driver;
	Properties pr;
	
	public mob_homePage(AndroidDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void clickPreference() {
		driver.findElement(AppiumBy.accessibilityId(pr.getProperty("preference"))).click();
	}
	
	public void clickViews() {
		driver.findElement(AppiumBy.accessibilityId(pr.getProperty("views"))).click();
	}
	
	public void clickOnOS() {
		driver.findElement(AppiumBy.accessibilityId(pr.getProperty("os"))).click();
	}
	
}

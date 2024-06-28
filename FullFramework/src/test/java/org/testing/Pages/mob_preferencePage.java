package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class mob_preferencePage {

	AndroidDriver driver;
	Properties pr;
	
	public mob_preferencePage(AndroidDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void clickOnDependecies() {
		driver.findElement(By.xpath(pr.getProperty("dependencies"))).click();
	}	
}

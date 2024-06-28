package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class mob_preferenceDependenciesPage {

	AndroidDriver driver;
	Properties pr;
	
	public mob_preferenceDependenciesPage(AndroidDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void clickOnWifiCheckBox() {
		driver.findElement(By.xpath(pr.getProperty("wificheckbox"))).click();
	}
	
	public void clickOnWifiSettings() {
		driver.findElement(By.xpath(pr.getProperty("wifisettings"))).click();
	}
	
	public void enterNameOfYourWifiInThePopUp() {
		driver.setClipboardText("WIFI_NAME_123");	    							// COPIE text
		WebElement text  = driver.findElement(By.id(pr.getProperty("wifipopup")));	// selects 'Wifi Settings'
		text.sendKeys(driver.getClipboardText());									// PASTE text.
	}
	
	public void clickOnOkButton() {
		driver.findElement(By.id(pr.getProperty("wifiokbutton"))).click();
	}
}

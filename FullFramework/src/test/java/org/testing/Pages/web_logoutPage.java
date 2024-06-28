package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_logoutPage {

	ChromeDriver driver;
	Properties pr;
	
	public web_logoutPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}	
	
	public void signout() throws InterruptedException {
		driver.findElement(By.id("avatar-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("SignOutButton"))).click();
	}	
}

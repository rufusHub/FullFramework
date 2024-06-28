package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_homePage {

	ChromeDriver driver;
	Properties pr;
	
	public web_homePage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}
	
	public void clickTrending() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("trending"))).click();
		Thread.sleep(3000);
	}
	
	public void clickHistory() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("history"))).click();
		Thread.sleep(3000);
	}
	
	public void clicksubscriptions() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("subscriptions"))).click();
		Thread.sleep(3000);
	}
	
	public void clickwatchlater() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("WatchLaterButton"))).click();
		Thread.sleep(3000);
	}
}

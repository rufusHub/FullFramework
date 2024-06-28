package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class web_videoPage {

	ChromeDriver driver;
	Properties pr;
	Actions action;
	
	public web_videoPage(ChromeDriver driver, Properties pr, Actions action) {
		this.driver = driver;
		this.pr = pr;
		this.action = action;
	}
	
	public void playVideoAndLike() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("search"))).sendKeys("python");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("video1"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(pr.getProperty("LikeButton"))).click();
		Thread.sleep(3000);
	}
	
	public void playVideoAndChanLSub() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("search"))).sendKeys("python");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("video1"))).click();
		Thread.sleep(7000);
		driver.findElement(By.cssSelector(pr.getProperty("SubscribeChannel"))).click();
		Thread.sleep(3000);
	}
	
	public void playVideoAndComment() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("search"))).sendKeys("python");
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("video1"))).click();
		Thread.sleep(7000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(pr.getProperty("SelectBox"))).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(pr.getProperty("BoxEntertext"))).sendKeys("Java is better");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("CommentButton"))).click();
		Thread.sleep(3000);
	}
	
}

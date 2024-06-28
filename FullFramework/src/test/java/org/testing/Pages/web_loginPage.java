package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class web_loginPage{

	ChromeDriver driver;
	Properties pr;
	
	public web_loginPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
		
	}
	
	public void signin(String userName, String password) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText(pr.getProperty("SignInButton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("EmailOrPhone"))).sendKeys(userName);		
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("ClickNext"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("ClickNext"))).click();
		Thread.sleep(4000);
	}
}

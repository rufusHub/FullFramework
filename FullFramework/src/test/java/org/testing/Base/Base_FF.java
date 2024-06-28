package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class Base_FF {

	public ChromeDriver driver_chrome;
	public AndroidDriver driver_android;
	public Properties webproperties;
	public Properties mobileproperties;
	public Actions action_chrome;
//	public AppiumDriverLocalService service;
	
	
	public String username = "cracksula@gmail.com"; 
	public String passwd = "crackSULA20#$";
	
	String propPathweb = "../FullFramework/webElement.properties";
	String url = "https://www.youtube.com";
	
	String deviceName = "R5CRA26RMNY";		//"R5CRA26RMNY" "L4SDU17907000554"
	String propPathMob = "../FullFramework/mobileElement.properties";
	
	//@BeforeMethod
	public void BrowserLaunch() throws IOException {
		// Load WEB properties.
		File f = new File(this.propPathweb);
		FileReader fr = new FileReader(f);
		webproperties = new Properties();
		webproperties.load(fr);
		
		// Launch browser, URL and maximize.
		driver_chrome = new ChromeDriver();
		driver_chrome.get(this.url);
		driver_chrome.manage().window().maximize();
		
		// Start Actions
		action_chrome = new Actions(driver_chrome);
	}
	
	//@AfterMethod
	public void BrowserClose() throws InterruptedException {
		Thread.sleep(3000);
		driver_chrome.close();
	}
	
	
	@Test
	public void appLaunch() throws IOException {
		System.out.println("jajaja");
		String apkName = "ApiDemo.apk";
				
		// Load mobile properties.
		File f = new File(this.propPathMob);
		FileReader fr = new FileReader(f);
		mobileproperties = new Properties();
		mobileproperties.load(fr);
		
		// Start Appium server from code.
		File js = new File("/home/rufo/.nvm/versions/node/v20.12.1/lib/node_modules/appium/build/lib/main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder()
				  .withAppiumJS(js)
				  .withIPAddress("0.0.0.0")
				  .withArgument(GeneralServerFlag.BASEPATH, "wd/hub")
				  .usingPort(4723)
				  .build();
		service.start();
				  
	    // Desire capabilities.
		File app = new File("/home/rufo/Documents/" + apkName);		  
		
		DesiredCapabilities cap = new DesiredCapabilities();		 
		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("deviceName", this.deviceName);
		cap.setCapability("platformName", "Android");
		cap.setCapability("automationName","UiAutomator2"); 
		  
		driver_android = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}
	
//	@AfterMethod
	public void appClose() {
//		service.stop();
		driver_android.close();		
	}
	
}




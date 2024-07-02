package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testing.Base.Base_FF;
import org.testing.Pages.web_homePage;
import org.testing.Pages.web_loginPage;
import org.testing.Pages.web_logoutPage;
import org.testing.assertions.Assertion;
import org.testing.utilities.ReportCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC1_web extends Base_FF{
	
	@Test(groups = {"web"})
	public void TC1_definition() throws InterruptedException, IOException {
		
		String expectedUrl = "https://www.youtube.com/";
		String path = "/home/rufo/Pictures/pic1.jpg"; 
		String className = "TC1_web";
		
		ExtentReports report = ReportCapture.handleReport();
		ExtentTest tc1 = report.startTest(className);
		
		web_loginPage login = new web_loginPage(driver_chrome, webproperties);
		login.signin(username, passwd);	
		
//		Assert.assertEquals(driver_chrome.getCurrentUrl(), expectedUrl );		//Hard
		Boolean result = Assertion.assertion_1(driver_chrome.getCurrentUrl(), expectedUrl, className);		//Soft
		if (result) {
			tc1.log(LogStatus.PASS, "TC1_web is getting passed");
		}
		else {
			tc1.log(LogStatus.FAIL, "TC1_web is getting failed");
		}
		ScreenshotCapture.takeScreenshot(driver_chrome, path);
		report.endTest(tc1);
		report.flush();
		
		web_homePage home = new web_homePage(driver_chrome, webproperties);
		home.clickTrending();
		
		web_logoutPage logout = new web_logoutPage(driver_chrome, webproperties);
		logout.signout();
	}	
}
		
package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testing.Base.Base_FF;
import org.testing.Pages.web_homePage;
import org.testing.Pages.web_loginPage;
import org.testing.Pages.web_logoutPage;
import org.testng.annotations.Test;

public class TC2_web extends Base_FF{
	
	@Test(groups = {"web"})
	public void TC2_definition() throws InterruptedException, IOException {
		
		web_loginPage login = new web_loginPage(driver_chrome, webproperties);
		login.signin(username, passwd);	
		
		web_homePage home = new web_homePage(driver_chrome, webproperties);
		home.clickHistory();
		
		web_logoutPage logout = new web_logoutPage(driver_chrome, webproperties);
		logout.signout();


	}	
}
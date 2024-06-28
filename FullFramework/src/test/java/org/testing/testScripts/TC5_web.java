package org.testing.testScripts;

import java.io.IOException;

import org.testing.Base.Base_FF;
import org.testing.Pages.web_loginPage;
import org.testing.Pages.web_logoutPage;
import org.testing.Pages.web_videoPage;
import org.testng.annotations.Test;

public class TC5_web extends Base_FF{
	
	@Test(groups = {"web"})
	public void TC5_definition() throws InterruptedException, IOException {
		
		web_loginPage login = new web_loginPage(driver_chrome, webproperties);
		login.signin(username, passwd);	
		
		web_videoPage video = new web_videoPage(driver_chrome, webproperties, action_chrome);
		video.playVideoAndChanLSub();
		
		web_logoutPage logout = new web_logoutPage(driver_chrome, webproperties);
		logout.signout();
	}	
}

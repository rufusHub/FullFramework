package org.testing.testScripts;

import java.io.IOException;

import org.testing.Base.Base_FF;
import org.testing.Pages.mob_homePage;
import org.testng.annotations.Test;

public class TC1_mob extends Base_FF{

	@Test(groups = {"mobile"})
	public void TC1_mob_def() {
		mob_homePage mhome = new mob_homePage(driver_android, mobileproperties);
		mhome.clickPreference();
	}	
}

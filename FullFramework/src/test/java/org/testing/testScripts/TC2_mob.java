package org.testing.testScripts;

import org.testing.Base.Base_FF;
import org.testing.Pages.mob_homePage;
import org.testing.Pages.mob_preferenceDependenciesPage;
import org.testing.Pages.mob_preferencePage;
import org.testng.annotations.Test;

public class TC2_mob extends Base_FF{

	@Test(groups = {"mobile"})
	public void TC2_mob_def() {
		mob_homePage mhome = new mob_homePage(driver_android, mobileproperties);
		mhome.clickPreference();
		
		mob_preferencePage pref = new mob_preferencePage(driver_android, mobileproperties);
		pref.clickOnDependecies();
		
		mob_preferenceDependenciesPage predep = new mob_preferenceDependenciesPage(driver_android, mobileproperties);
		predep.clickOnWifiCheckBox();
		predep.clickOnWifiSettings();
		predep.enterNameOfYourWifiInThePopUp();
		predep.clickOnOkButton();
	}
}
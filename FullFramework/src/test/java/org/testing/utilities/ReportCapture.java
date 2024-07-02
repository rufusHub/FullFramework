package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportCapture {

	public static ExtentReports handleReport() {	
		ExtentReports rep = new ExtentReports("/home/rufo/logs/reportFF.html", false);
		return rep;
	}
}

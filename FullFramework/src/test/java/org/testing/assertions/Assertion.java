package org.testing.assertions;

import org.testing.utilities.LogsCapture;

public class Assertion {

	public static Boolean assertion_1(String actual, String expected, String className) {
		if(actual.equals(expected)) {
			LogsCapture.takeLog("Assertion is getting passed", className);
			return true;
		}
		else {
			LogsCapture.takeLog("Assertion is getting failed", className);
			return false;
		}
	}
}

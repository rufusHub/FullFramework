package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public static void takeLog(String msg, String className) {
		DOMConfigurator.configure("../FullFramework/Layout.xml");
		Logger L = Logger.getLogger(className);
		L.info(msg);
	}
}

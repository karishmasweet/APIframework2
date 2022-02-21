package org.testing.utilities2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLog(String classname,String msg)
	{
		DOMConfigurator.configure("../APIframework2/layout.xml");
		Logger log=Logger.getLogger(classname);
		log.info(msg);
	}

}

package org.testing.TestScripts2;

import java.io.IOException;

import org.testing.utilities2.LoadXmlData;

public class TC7 
{
	public static void main(String[] args) throws IOException
	{
		LoadXmlData.readXml("../APIframework2/src/test/java/org/testing/Payloads/xmlfile.xml");
		
	}

}

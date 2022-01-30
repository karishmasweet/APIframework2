package org.testing.TestScripts2;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps2.HTTPMethods;
import org.testing.utilities2.LoadPropertiesFile;
import org.testing.utilities2.jsonParsing;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4 
{
	@Test
	public void testCase4() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesFile("../APIframework2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getAllrecords("QA_URI_APIFOLKS");
		System.out.println("***************TC4************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("response is------");
		System.out.println(res.asString());
		jsonParsing.jsonParseAllKeys(res.asString(),"id");
		System.out.println("****************************");
	}

}

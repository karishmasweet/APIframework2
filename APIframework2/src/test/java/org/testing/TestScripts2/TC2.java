package org.testing.TestScripts2;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps2.HTTPMethods;
import org.testing.utilities2.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2 
{
@Test
	public void testCase2() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesFile("../APIframework2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.getMethod("QA_URI_APIFOLKS",TC1.responseidvalue);
		System.out.println("***************TC2************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("response is");
		System.out.println(res.asString());
		
		ResponseValidation.statusCodeValidation(200, res);
		ResponseValidation.dataValidation("karishma", res, "firstname");
		
	}
}

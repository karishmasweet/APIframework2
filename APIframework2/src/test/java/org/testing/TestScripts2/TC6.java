package org.testing.TestScripts2;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps2.HTTPMethods;

import org.testing.utilities2.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC6 
{
	@Test
	public void Testcase6() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesFile("../APIframework2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.Delete("QA_URI_APIFOLKS",TC1.responseidvalue);
		System.out.println("---------------Delete Request--------------");
		System.out.println("status code is ");
		System.out.println(res.getStatusCode());
		
	
	}

}

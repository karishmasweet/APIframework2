package org.testing.TestScripts2;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps2.HTTPMethods;
import org.testing.utilities2.Json;
import org.testing.utilities2.LoadPropertiesFile;
import org.testing.utilities2.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5 
{
	@Test
	public void testCase5() throws IOException
	{
		Properties pr=LoadPropertiesFile.propertiesFile("../APIframework2/URI.properties");
		String bodydata=Json.loadJsonFile("../APIframework2/src/test/java/org/testing/Payloads/bodydataforupdate.json");
		bodydata=jsonVariable.jsonVariableReplacement(bodydata,"id",TC1.responseidvalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.updateRecord("QA_URI_APIFOLKS",TC1.responseidvalue,bodydata);
		System.out.println("***************TC5-update************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		System.out.println("response is------");
		System.out.println(res.asString());
	}

}

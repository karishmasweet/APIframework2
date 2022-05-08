package org.testing.TestScripts2;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseValidation;
import org.testing.testSteps2.HTTPMethods;
import org.testing.utilities2.Json;
import org.testing.utilities2.LoadPropertiesFile;
import org.testing.utilities2.LogsCapture;
import org.testing.utilities2.RandomData;
import org.testing.utilities2.ReportGeneration;
import org.testing.utilities2.jsonParsing;
import org.testing.utilities2.jsonVariable;
import org.testng.annotations.Test;

import io.restassured.response.Response;

//TC1----POST request
//we required bodydata for the post request
//we required the properties object

public class TC1 extends ReportGeneration
{
	static String responseidvalue;
	@Test
	public void testCase1()throws IOException
{
        ExtentTest test=reports.startTest("Testcase1_Postrequest");
		
		String bodydata=Json.loadJsonFile("../APIframework2/src/test/java/org/testing/Payloads/bodyData.json");
		String randomId=RandomData.random();
		bodydata=jsonVariable.jsonVariableReplacement(bodydata,"id",randomId);
		
		Properties pr=LoadPropertiesFile.propertiesFile("../APIframework2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.postmethod(bodydata,"QA_URI_APIFOLKS");
		responseidvalue=jsonParsing.jsonParse(res.asString(),"id");
		
		LogsCapture.takeLog("TC1", "statusCode is "+res.statusCode());
		
		ResponseValidation.statusCodeValidation(201, res);
		
		
	}

}

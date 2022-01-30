package org.testing.ResponseValidation;
import org.testing.utilities2.jsonParsing;

import io.restassured.response.Response;

public class ResponseValidation 

{
	public static void statusCodeValidation(int expectedResponseCode,Response res)
	{
		if(res.statusCode()==expectedResponseCode)
		{
			System.out.println("Status code is correct "+res.statusCode());
		}
		
		else
		{
			System.out.println("Status code is not matching "+res.statusCode());
		}
	}
public static void dataValidation(String expectedData,Response res,String jsonPath)
{
String actualData=jsonParsing.jsonParseUsingjsonPath(res, jsonPath);
if(actualData.equals(expectedData))
		{
	      System.out.println("Data is matching");
		}
else
    {
	 System.out.println("Dat is not matching");
	}

}
}

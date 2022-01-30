package org.testing.testSteps2;
import static com.jayway.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response postmethod(String bodydata,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(uriKey));
		System.out.println("Status code is "+res.statusCode());
		
		return res;
	}
	
	public Response getMethod(String urikey,String id)
	{
		String uri=pr.getProperty(urikey)+"/"+id;
	
		Response res=
				given()
				.contentType(ContentType.JSON)
		        .when()
		        .get(uri);
		   return res;
				
		}
	
	public Response getAllrecords(String urikey)
	{

		Response res=
				given()
				.contentType(ContentType.JSON)
		        .when()
		        .get(pr.getProperty(urikey));
		   return res;
				
		}
	public Response updateRecord(String urikey, String id,String bodyData)
	{
		String uri=pr.getProperty(urikey)+"/"+id;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.put(uri);
				
				return res;
		
		
	}
	
	public Response Delete(String uriKey, String id)
	{
		String uri=pr.getProperty(uriKey)+"/"+id;
		System.out.println(uri);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		
		return res;
	}

}

package org.testing.utilities2;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 
{
	public String conversionxmltoJson(String xml)
	{
		JSONObject js=XML.toJSONObject(xml);
		return js.toString();
		
	}

	public String conversionJsontoxml(String jsonData)
	{
		JSONObject obj=new JSONObject(jsonData);
		String xml_data=XML.toString(obj);
		return xml_data;
		
	}
}

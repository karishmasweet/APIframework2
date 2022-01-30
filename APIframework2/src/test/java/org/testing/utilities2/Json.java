package org.testing.utilities2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Json 
{
	public static String loadJsonFile(String path) throws FileNotFoundException
	{
		File f=new File(path);
		FileInputStream fi=new FileInputStream(f);
		JSONTokener js=new JSONTokener(fi);
		JSONObject body=new JSONObject(js);
		return body.toString();
		
	}

}

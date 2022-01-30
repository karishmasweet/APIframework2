package org.testing.utilities2;

import java.util.regex.Pattern;

public class jsonVariable 
{
	public static String jsonVariableReplacement(String data,String keyName,String keyValue)
	{
		data=data.replaceAll(Pattern.quote("{{"+keyName+"}}"),keyValue);
		return data;
	}

}

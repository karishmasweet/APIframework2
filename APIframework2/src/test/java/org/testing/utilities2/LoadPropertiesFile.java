package org.testing.utilities2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile 
{
	public static Properties propertiesFile(String path) throws IOException
	{
		File f=new File(path);//connection establish
		FileInputStream fi=new FileInputStream(f);// object of FileInputStream
		Properties pr=new Properties();// creating object of Properties
		pr.load(fi);//loading the properties
		
		return pr;
		
	}

}

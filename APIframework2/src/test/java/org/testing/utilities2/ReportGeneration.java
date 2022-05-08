package org.testing.utilities2;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportGeneration 
{
	
public ExtentReports reports;

public ExtentReports report()
{
reports=new ExtentReports("../APIframework2/file.xls",false);
return reports;

}

}

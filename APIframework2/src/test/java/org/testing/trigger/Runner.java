package org.testing.trigger;

import java.io.IOException;

import org.testing.TestScripts2.TC1;
import org.testing.TestScripts2.TC2;
import org.testing.TestScripts2.TC3;
import org.testing.TestScripts2.TC4;
import org.testing.TestScripts2.TC5;
import org.testing.TestScripts2.TC6;

public class Runner 
{
	public static void main(String[] args) throws IOException 
	{
		TC1 obj=new TC1();
		obj.testCase1();
		TC2 obj2=new TC2();
		obj2.testCase2();
		TC3 obj3=new TC3();
		obj3.testCase3();
		TC4 obj4=new TC4();
		obj4.testCase4();
		TC5 obj5=new TC5();
		obj5.testCase5();
		TC6 obj6=new TC6();
		obj6.Testcase6();
	}

}

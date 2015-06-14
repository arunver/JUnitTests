package com.example.tests1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		
		Result result= JUnitCore.runClasses(TestArithmetic.class);
		for(Failure failures: result.getFailures())
		{
			System.out.println("failure is: "+failures.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}

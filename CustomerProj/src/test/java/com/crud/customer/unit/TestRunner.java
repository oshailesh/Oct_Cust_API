package com.crud.customer.unit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		
		Result res = JUnitCore.runClasses(AllTests.class);
		
		for(Failure failure:res.getFailures()) {
			System.out.println();
			System.out.println(failure.toString());			
		}
		System.out.println(res.wasSuccessful());
	}

}
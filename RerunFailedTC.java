package org.RerunConcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//IRetryAnalyzer is super class of retryAnalyzer

public class RerunFailedTC implements IRetryAnalyzer{
	
	int min = 1, max = 3;

	public boolean retry(ITestResult result) {
		if (min <= max) {
			min++;
			return true;
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package org.RerunConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleRerun {
	
	// 1. Rerun Manual Method
	// 2. If we used retryAnalyzer in tc is called partially Rerun Method
	
	
	@Test
	private void tc3() {	
		System.out.println(8/0);
		System.out.println("TestCase2");		
	}
	@Test
	private void tc2() {
		Assert.assertTrue(10>20, "Check tc2");
		System.out.println("TestCase3" );
		
	}
	@Test
	private void tc1() {
		
		System.out.println(10/2);
		System.out.println("TestCase1");
	}		
		
		
	}



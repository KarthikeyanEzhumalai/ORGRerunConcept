package org.RerunConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example {
	@Test
	private void tc2() {
		Assert.assertTrue(10>100, "Check TC2");
		System.out.println("TestCase2");
	}
	@Test
	private void tc3() {
		System.out.println(3/0);
		System.out.println("TestCase3");
		
	}
	@Test
	private void tc1() {
		System.out.println("TestCase1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

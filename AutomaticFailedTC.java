package org.RerunConcept;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AutomaticFailedTC implements IAnnotationTransformer{

	public void transform(ITestAnnotation krn, Class testClass, Constructor testConstructor, Method testMethod) {
		
		IRetryAnalyzer res = krn.getRetryAnalyzer();
		if (res == null) {
			
			krn.setRetryAnalyzer(RerunFailedTC.class);
			
			
		}
		
		
		
	}		
		
	}



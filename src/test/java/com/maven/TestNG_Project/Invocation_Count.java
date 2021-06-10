package com.maven.TestNG_Project;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test
	private void browserLaunch() {
		// TODO Auto-generated method stub
System.out.println("Browser");
	}
	@Test(invocationCount = 3)
	private void refresh() {
		// TODO Auto-generated method stub
System.out.println("Refresh");
		}
	@Test
	private void url() {
		// TODO Auto-generated method stub
System.out.println("url");
	}
}
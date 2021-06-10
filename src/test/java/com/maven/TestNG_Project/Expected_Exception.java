package com.maven.TestNG_Project;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		int a=10;
		System.out.println(a/0);
	}
	@Test(expectedExceptions = NullPointerException.class)
	private void demo1() {
		int a=10;
		System.out.println(a/0);
	}
}

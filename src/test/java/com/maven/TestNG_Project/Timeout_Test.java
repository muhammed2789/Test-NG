package com.maven.TestNG_Project;

import org.testng.annotations.Test;

public class Timeout_Test {
	@Test(timeOut = 5000)
	private void demo() throws Throwable {
		System.out.println("Browser");
		Thread.sleep(1000);
		System.out.println("Login");
		Thread.sleep(2000);
		System.out.println("navigate");
	}

}

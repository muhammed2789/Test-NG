package com.maven.TestNG_Project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	@Test
	@Parameters({"username","password"})//reference name
	private void credentials(@Optional ("Muhammed")String username, int password) {
		System.out.println("Username : "+username);
		System.out.println("Password :"+password);
	}
}

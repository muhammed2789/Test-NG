package com.maven.TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	//validation -dynamic mechanism of software testing and validate actual product.
	//verification-verifying process includes checking documents,design,code,program.

	@Test
	private void demo() {
		String db_Username="Smith";
		String actual_Username = null;
		System.out.println("Welcome to sign in page");
	//Assert.assertEquals(db_Username, actual_Username);
	//	Assert.assertNotEquals(actual_Username, db_Username);
		Assert.assertNull(actual_Username);
		System.out.println("Welcome to Homepage");
	}
	
}

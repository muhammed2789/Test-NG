package com.maven.TestNG_Project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	@Test
	private void demo() {
		String db_Username="Smith";
		String actual_Username = "Starc";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_Username, db_Username);
		System.out.println("Verification completed");
}
}

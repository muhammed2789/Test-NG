package com.maven.TestNG_Project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	private void credentials() {

			String db_Username="Smith";
			String actual_Username="Smith";
			Assert.assertEquals(actual_Username, db_Username);
	}
	
	@Test
	private void credentials1() {

			String db_Username="Smith777";
			String actual_Username="Starc999";
			Assert.assertEquals(actual_Username, db_Username);
	}
	
}

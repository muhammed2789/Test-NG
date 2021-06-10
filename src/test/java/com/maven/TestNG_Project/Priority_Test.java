package com.maven.TestNG_Project;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority = 0 )
	private void laptop() {
		System.out.println("Laptop Search");
	}
	@Test(priority = 1)
	private void mobile() {
		System.out.println("Mobile Search");
	}
	@Test
	private void earphones() {
		System.out.println("Earphones Search");
	}
}

package com.maven.TestNG_Project;

import org.testng.annotations.Test;

public class Grouping_Test {
	@Test(groups = "Electronics")
private void laptop() {
	System.out.println("Laptop");
}
	@Test(groups = "Electronics")
private void earphones() {
	System.out.println("Earphones");
}
	@Test(groups = "Electronics")
private void mobile() {
	System.out.println("mobile");
}
	@Test(groups="social media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(groups="social media")
	private void faceapp() {
		System.out.println("Faceapp");
}
}
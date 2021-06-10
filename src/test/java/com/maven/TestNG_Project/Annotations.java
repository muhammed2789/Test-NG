package com.maven.TestNG_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

		@BeforeSuite
		private void setProperty() {
			System.out.println("Set Property");
		}
		
		@BeforeTest
		private void BrowserLaunch() {
			System.out.println("Browser Launch");
		}
		@BeforeClass
		private void Url() {
			System.out.println("Url");
				}
		@BeforeMethod
		private void login() {
			System.out.println("Login");
		}
		@Test
		private void laptop() {
			System.out.println("Laptop Search");
		}
		@Test
		private void mobile() {
			System.out.println("Mobile Search");
		}
		@Test
		private void earphones() {
			System.out.println("Earphones Search");
		}
		@AfterMethod
		private void logout() {
			System.out.println("LogOut");
		}
		@AfterClass
		private void verifyHomepage() {
			System.out.println("HomePage");
		}
		@AfterTest
		private void close() {
			System.out.println("Close");
		}
		@AfterSuite
		private void deleteAllCookies() {
			System.out.println("Delete All Cookies");
		}
		
	}

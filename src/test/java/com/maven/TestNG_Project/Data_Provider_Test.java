package com.maven.TestNG_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	@Test(dataProvider = "test_Data")
	private void credentials(String username,int password,String add) {
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);
		System.out.println("Address :"+add);

	}
	//Object[][]
	@DataProvider
	private Object[][] test_Data() { //from void to return type
		return new Object[][] {
			
			{"Aashif",454343,"porur"},
			{"Muhammed",324324,"Ayyappanthangal"},
			{"Samad",3243,"karambakkam"},
			{"Abdul",3245,"Porur"}
		};
		
		
		
	}

}

package com.crm.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "smokeTest")
	public void createContactTest() {
		System.out.println("execute createContactTest");
	}
	
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}

	@Test(groups = "regressionTest")
	public void deleteConatct() {
		System.out.println("execute deleteConatct");
	}
	
	@Test(groups = "regressionTest")
	public void peleteConatct() {
		System.out.println("execute deleteConatct");
	}
}

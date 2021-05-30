package com.test.atul.testrunner;


import com.test.atul.webdrivermanager.DriverManager;

import io.cucumber.java.After;


public class Hooks {
	
	@After
	public void testTearDown()
	{
		DriverManager.quiteDriver();
	}
	
}

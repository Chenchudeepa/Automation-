package com.automation.scripts;

import org.testng.annotations.Test;

import com.automation.businesslogic.CommonBusinessLibrary;

public class Login extends CommonBusinessLibrary{
		
	@Test
	public void login() throws Throwable {	
		//Login in to the application
		enterUserName();
		Thread.sleep(2000);
		enterPassword();
		Thread.sleep(2000);
		clickSubmit();
	}
	
}

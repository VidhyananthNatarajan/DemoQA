package com.demoqa.pages;

import com.demoqa.commonmethods.BaseClass;

public class Register extends BaseClass {
	
	public Register enterusername() {
		driver.findElementById("email").sendKeys("test@gmail.com");
		return this;
	}
	
	public Register enterpassword() {
		driver.findElementByName("password").sendKeys("test12345");
		return this;
	}
	
	public Register enterconfpassword() {
		driver.findElementByName("confirmPassword").sendKeys("test12345");
		return this;
	}
	
	public RegisterSuccessPage clicksubmit() {
		driver.findElementByName("submit").click();
		return new RegisterSuccessPage();
	}

}

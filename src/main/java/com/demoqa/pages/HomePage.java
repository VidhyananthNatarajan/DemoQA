package com.demoqa.pages;

import com.demoqa.commonmethods.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage gethomepagetitle() {
		String title = driver.getTitle();
		System.out.println("Title of the page is:"+title);
		return this;
	}
	
	public Register clickregister() {
		driver.findElementByLinkText("REGISTER").click();
		return new Register();
		
		
	}

}

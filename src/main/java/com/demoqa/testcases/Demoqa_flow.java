package com.demoqa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoqa.commonmethods.BaseClass;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.Register;



public class Demoqa_flow extends BaseClass {
	
@BeforeTest
	public void testinputs() {
	
	testcaseName ="DemoQA flow";
	testcaseDec ="To Validate DemoQA flow";
    author ="Automation Tester";
	category="Functional Test";
		
	}


@Test 
public void loginHRM() {
	HomePage hp = new HomePage();
	hp.clickregister();
	
	Register rg = new Register();
	rg.enterusername();
	rg.enterpassword();
	rg.enterconfpassword();
	rg.clicksubmit();
	

	
} 

}

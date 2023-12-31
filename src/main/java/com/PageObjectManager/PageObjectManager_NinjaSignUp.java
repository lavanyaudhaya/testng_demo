package com.PageObjectManager;

import org.openqa.selenium.support.PageFactory;

import com.testNg_baseclasses.BaseClass_TesNgDemo;

public class PageObjectManager_NinjaSignUp extends BaseClass_TesNgDemo{

	
	
	public PageObjectManager_NinjaSignUp() {
		PageFactory.initElements(driver, this);
	}
	
	private PageObjectManager_NinjaSignUp ninja_Pom;
	
	public PageObjectManager_NinjaSignUp getPageObjectManager_NinjaSignUp() {
		ninja_Pom=new PageObjectManager_NinjaSignUp();
		return ninja_Pom;
		
	}
}



package com.testNg_runnerclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testNg_baseclasses.BaseClass_TesNgDemo;
import com.testNg_pom_Classes.LoginPage_Locators_Interface;
import com.testNg_pom_Classes.Signup_Pom1;

public class RunnerClass_TestNGDemo extends BaseClass_TesNgDemo{
	
	//Signup_Pom1 pom_element = new Signup_Pom1(driver);
	Signup_Pom1 pom_element = new Signup_Pom1();
	
@BeforeTest
public void browserLaunch() {
	launchBrowser("chrome");	
}

@BeforeClass
public void urlLaunch() throws InterruptedException {
	launchURL("https://tutorialsninja.com/demo/index.php?route=account/register");
	Thread.sleep(5000);
}

@Test(priority = 1)
 public void user_Data() {
	 sendText(pom_element.getSignup_Pom1().getFirstNameText(),  LoginPage_Locators_Interface.fName);
	 sendText(pom_element.getSignup_Pom1().getLastNameText(), LoginPage_Locators_Interface.lName);
	 sendText(pom_element.getSignup_Pom1().getEmailText(), LoginPage_Locators_Interface.eMail);
	 sendText(pom_element.getSignup_Pom1().getTelephoneText(), LoginPage_Locators_Interface.phoneNum);
	 sendText(pom_element.getSignup_Pom1().getPwdText(), LoginPage_Locators_Interface.pwd);
	 sendText(pom_element.getSignup_Pom1().getConfirm_pwdText(), LoginPage_Locators_Interface.conf_pwd);
 }
 
 @Test(priority = 2)
 public void newsLetterChkBox() {
	 
	 clickElement(pom_element.getSignup_Pom1().getNewsLetterRadioButton());	 
 }
 
 @Test(priority = 3)
 public void privacyPolicyRadButton() {
	
	 clickElement(pom_element.getSignup_Pom1().getPrivacyPolicyCheckBox());
	 
 }
 
 @Test(priority = 4)
 public void agreeContButton() {
	 
	 clickElement(pom_element.getSignup_Pom1().getAgreeContinueButton());
 }
 
 @AfterMethod
 public void takePicture() throws IOException, InterruptedException {
	 Thread.sleep(3000);
	 takeScreenShot("NinjaSignUp");
	 System.out.println("Screenshot captured");
 }
 @AfterTest
 public void quit() {
	 closeBrowser();
 }
}
 

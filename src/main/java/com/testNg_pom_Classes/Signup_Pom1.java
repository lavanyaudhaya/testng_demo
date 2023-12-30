package com.testNg_pom_Classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testNg_baseclasses.BaseClass_TesNgDemo;

public class Signup_Pom1 extends BaseClass_TesNgDemo implements LoginPage_Locators_Interface{
	
	public Signup_Pom1() {
		PageFactory.initElements(driver, this);
	}
	
	private Signup_Pom1 ninja_Pom;	
	public Signup_Pom1 getSignup_Pom1() {
		ninja_Pom=new Signup_Pom1();
		return ninja_Pom;
	}	
	
	
	@FindBy(name = firstName)
	private WebElement firstNameText;
	public WebElement getFirstNameText() {
		return firstNameText;
	}
	
	@FindBy(name = lastName)
	private WebElement lastNameText;
	public WebElement getLastNameText() {
		return lastNameText;
	}
	
	@FindBy(name = email)
	private WebElement emailText;
	public WebElement getEmailText() {
		return emailText;
	}
	
	@FindBy(name = telephone)
	private WebElement telephoneText;
	public WebElement getTelephoneText() {
		return telephoneText;
	}
	
	@FindBy(name = password)
	private WebElement pwdText;
	public WebElement getPwdText() {
		return pwdText;
	}
	
	@FindBy(name = con_password)
	private WebElement confirm_pwdText;
	public WebElement getConfirm_pwdText() {
		return confirm_pwdText;
	}
	
	@FindBy(name = newsLetterYes)
	private WebElement newsLetterRadioButton;
	public WebElement getNewsLetterRadioButton() {
		return newsLetterRadioButton;
	}
	
	@FindBy(xpath = privacy_policy)
	private WebElement privacyPolicyCheckBox;
	public WebElement getPrivacyPolicyCheckBox() {
		return privacyPolicyCheckBox;
	}
	
	@FindBy(xpath = continueButton)
	private WebElement agreeContinueButton;	
	public WebElement getAgreeContinueButton() {
		return agreeContinueButton;
	}	

}

//public WebDriver driver;
//public Signup_Pom1(WebDriver driver1) {
//	driver =  driver1;
//	PageFactory.initElements(driver, driver1);
//}

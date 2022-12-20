package com.Autom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage { 

	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement signInBtn;
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement enterMblNo;
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continuebtn;
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	private WebElement enterPassword;
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement signInBtn1;
	@FindBy(xpath="//input[@class=\"nav-input nav-progressive-attribute\"]['1']")
	private WebElement searchfelid;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnsignInBtn() {
		this.signInBtn.click();
	}
	public void enterMblNo(String number) {
		this.enterMblNo.sendKeys(number);
	}
	public void clickOnContinueBtn() {
		this.continuebtn.click();
	}
	public void enterPassword(String password) {
		this.enterPassword.sendKeys(password);
	}
	public void clickOnsignInBtn1() {
		this.signInBtn1.click();
	}
	public void clickOnsearchfelid() {
		this.searchfelid.click();
		//this.searchfelid.sendKeys(pname);
	}
}
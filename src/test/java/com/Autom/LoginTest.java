package com.Autom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	private WebDriver driver = null;
	private LoginPage Obj = null;

	@BeforeClass
	public void initializeWebdriver() throws IOException {
		driver = GetWebDriver();
		this.Obj = new LoginPage(driver);
	}

	@Test
	public void verifyLoginTest() throws InterruptedException {
		this.Obj.clickOnsignInBtn();
		this.Obj.enterMblNo("9182772174");
		this.Obj.clickOnContinueBtn();
		this.Obj.enterPassword("Tejudrlng27");
		this.Obj.clickOnsignInBtn1();
	}
}
package com.pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	WebElement uid;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	@FindBy(name = "btnReset")
	WebElement btnReset;

	public void setUserID(String userId) {
		uid.sendKeys(userId);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickSubmit() {
		btnLogin.click();
	}

	public void clickReset() {
		btnReset.click();
	}
}

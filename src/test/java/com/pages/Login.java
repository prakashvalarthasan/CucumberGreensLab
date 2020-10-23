package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class Login extends FunctionalLibrary{
public Login() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement txtUser;

@FindBy(id="password")
private WebElement txtPass;

@FindBy(id="login")
private WebElement btnLogin;

public WebElement getTxtUser() {
	return txtUser;
}

public WebElement getTxtPass() {
	return txtPass;
}

public WebElement getBtnLogin() {
	return btnLogin;
}
 public void login(String userName, String Password ) {
	type(txtUser, userName);
	type(txtPass, Password);
	click(getBtnLogin());

}
}

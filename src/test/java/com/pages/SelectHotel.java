package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class SelectHotel extends FunctionalLibrary {

	public SelectHotel() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id="radiobutton_0")
	private WebElement selectRadio;

@FindBys({@FindBy(id="continue"),@FindBy(xpath="//input[@type='submit']")})
private WebElement continueBtn;

public WebElement getSelectRadio() {
	return selectRadio;
}

public WebElement getContinueBtn() {
	return continueBtn;
}
	
public void slctHotel() {
	click(getSelectRadio());
	click(getContinueBtn());
}
}

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class bookingConfirmation extends FunctionalLibrary {
	public bookingConfirmation() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	public void confirmation() {
		String orderId = getAttributeValue(getOrderNo());
		System.out.println("My order is"+orderId);
	quit();

	}
}

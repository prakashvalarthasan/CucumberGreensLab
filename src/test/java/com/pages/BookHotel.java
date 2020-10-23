package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class BookHotel extends FunctionalLibrary{
	
	public BookHotel() {
	PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(id="first_name"),@FindBy(xpath="(//input[@type='text'])[11]")})
	private WebElement firstname;
	
	@FindAll({@FindBy(id="last_name"),@FindBy(xpath="(//input[@type='text'])[12]")})
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNum;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	public void bookAHotel(String firstName,String lastName,String billingAddress, String creditCardNo, String creditCardType, String expiryDate, String expiryYear,String CVV) {
		type(getFirstname(), firstName);
		type(getLastName(),lastName);
		type(getAddress(), billingAddress);
		type(getCardNum(), creditCardNo);
		selectByText(getCardType(), creditCardType);
		selectByText(getExpMonth(), expiryDate);
		selectByText(getExpYear(), expiryYear);
		type(getCvv(), CVV);
		click(getBookNowBtn());
		}
public void book(String firstName,String lastName,String billingAddress) {
	type(getFirstname(), firstName);
	type(getLastName(), lastName);
	type(getAddress(), billingAddress);
	}

}

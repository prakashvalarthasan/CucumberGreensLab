package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.pages.BookHotel;
import com.pages.Login;
import com.pages.SearchHotel;
import com.pages.SelectHotel;
import com.pages.bookingConfirmation;
import com.utilities.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginPageSteps extends FunctionalLibrary  {
	Login loginPage;
	SearchHotel searchHotelPage;
	SelectHotel selectHotelPage;
	BookHotel bookHotelPage;
	bookingConfirmation confirmation;
	
	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
	   getDriver();
	   loadUrl("http://adactinhotelapp.com/");
	}

	@When("User must login using {string} and {string}")
	public void user_must_login_using_and(String userName, String passWord) {
	    loginPage = new Login();
	    loginPage.login(userName, passWord);
	    
	}

	@When("User should select the hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select_the_hotel(String location, String hotel, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
	    searchHotelPage = new SearchHotel();
	    searchHotelPage.searchHotel(location, hotel, roomType, noOfRooms, checkInDate, checkOutDate, adultsPerRoom, childrenPerRoom);
	    
	}

	@When("user must select the hotel and click continue")
	public void user_must_select_the_hotel_and_click_continue() {
	    selectHotelPage = new SelectHotel();
	    selectHotelPage.slctHotel();
	}

	/*@When("user should select the {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_select_the_and(String firstName,String lastName,String billingAddress, String creditCardNo, String creditCardType, String expiryDate, String expiryYear,String CVV) {
	  bookHotelPage = new BookHotel();
	  bookHotelPage.bookAHotel(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryDate, expiryYear, CVV);
	}*/
	
	@When("user should select the {string},{string},{string}")
	public void user_should_select_the(String firstName, String lastName, String billingAddress, io.cucumber.datatable.DataTable dataTable) {
		  bookHotelPage = new BookHotel();
		  bookHotelPage.book(firstName, lastName, billingAddress);
		  List<Map<String, String>> em = dataTable.asMaps();
		  			String cno = em.get(0).get("CREDITCARDNO");
		  			type(bookHotelPage.getCardNum(), cno);
		  			//actual 
		  			Map<String, String> mp = em.get(1);
		  			String st = mp.get("CARDTYPE");
		  			System.out.println(st);
		  			type(bookHotelPage.getCardType(), st);
		  			//
		  			String exMonth = em.get(3).get("EXPIRYMONTH");
		  			type(bookHotelPage.getExpMonth(), exMonth);
		  			//
		  			String exYear = em.get(2).get("EXPIRYYEAR");
		  			selectByText(bookHotelPage.getExpYear(), exYear);
		  			//
		  			String cVV = em.get(2).get("CVV");
		  			type(bookHotelPage.getCvv(), cVV);
		  			click(bookHotelPage.getBookNowBtn());
	}

	@Then("user must recieve the order no")
	public void user_must_recieve_the_order_no() {
	  confirmation = new bookingConfirmation();
	  confirmation.confirmation();
	  
	    
	}



}

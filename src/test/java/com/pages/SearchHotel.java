package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class SearchHotel extends FunctionalLibrary {
public SearchHotel() {
PageFactory.initElements(driver, this);
}

@FindBy(id="location")
private WebElement searchLocation;

@FindBy(id="hotels")
private WebElement searchHotel;

@FindBy(id="room_type")
private WebElement roomType;

@FindBy(id="room_nos")
private WebElement noOfRoom;

@FindBy(id="datepick_in")
private WebElement checkInDate;

@FindBy(id="datepick_out")
private WebElement checkOutDate;

@FindBy(id="adult_room")
private WebElement adultsRoom;

@FindBy(id="child_room")
private WebElement childRoom;

@FindBy(id="Submit")
private WebElement searchBtn;

public WebElement getSearchBtn() {
	return searchBtn;
}

public WebElement getSearchLocation() {
	return searchLocation;
}

public WebElement getSearchHotel() {
	return searchHotel;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNoOfRoom() {
	return noOfRoom;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public WebElement getAdultsRoom() {
	return adultsRoom;
}

public WebElement getChildRoom() {
	return childRoom;
}

 public void searchHotel(String loacation,String hotel,String roomType,String noOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom,String childrenPerRoom) {
	selectByText(getSearchLocation(),loacation );
	selectByText(getSearchHotel(), hotel);
	selectByText(getRoomType(), roomType);
	selectByText(getNoOfRoom(), noOfRooms);
	type(getCheckInDate(), checkInDate);
	type(getCheckOutDate(), checkOutDate);
	selectByText(getAdultsRoom(), adultsPerRoom);
	selectByText(getChildRoom(), childrenPerRoom);
	click(getSearchBtn());
	
}
}

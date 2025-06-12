package com.kodewalaDependence;

class Address {
private String firstMain;
private String secondMain;
private String pincode;
private String city;
private String country;
private Game game;
public Game getGame() {
	return game;
}
public Address(String firstMain, String secondMain, String pincode, String city, String country,Game game) {
	super();
	this.firstMain = firstMain;
	this.secondMain = secondMain;
	this.pincode = pincode;
	this.city = city;
	this.country = country;
	this.game = game;
}
public String getFirstMain() {
	return firstMain;
}
public void setFirstMain(String firstMain) {
	this.firstMain = firstMain;
}
public String getSecondMain() {
	return secondMain;
}
public void setSecondMain(String secondMain) {
	this.secondMain = secondMain;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

public String toString() {
	return "FIRSTMAIN : " + firstMain + ",secondMain : " + secondMain + ",pincode : " + pincode + ", city : " + ", country : " +country + ", GAME : " + game;
}

}

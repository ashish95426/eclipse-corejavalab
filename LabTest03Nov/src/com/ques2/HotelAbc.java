/*
 * program:to book room
 * @author:Ashish kumar sahu
 * @date:03/11/22
 */
//declaring package
package com.ques2;

//declaring class
public class HotelAbc {
	//declaring instance variables
	int roomNumber;
	String roomType;
	double roomArea;
	boolean acFacility;
	double roomPrice;
	
	//default constructor
	public HotelAbc() {
		super();
		
		this.roomNumber=0;
		this.roomType="normal";
		this.roomArea=150;
		this.acFacility=false;
		this.roomPrice=2000;
	}//end of default constructor
   
	//prametrised constructor with fixed roomtype and price
	public HotelAbc(int roomNumber, double roomArea, boolean acFacility) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = "standard";
		this.roomArea = roomArea;
		this.acFacility = acFacility;
		this.roomPrice = 3000;
	}//end of constructor

	//parametrised constructor
	public HotelAbc(int roomNumber, String roomType, double roomArea, boolean acFacility, double roomPrice) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acFacility = acFacility;
		this.roomPrice = roomPrice;
	}//end of constructor



	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	//start of method for room price 
	public void setRoomPrice(double roomPrice,float discount) {
		double discount=((discount/roomPrice)*100);
		this.roomPrice = roomPrice-discount;
		System.out.println("discount = "+discount);
	}//end of method


	

}//end class

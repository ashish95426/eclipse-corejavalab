/*
 * program:to book room
 * @author:Ashish kumar sahu
 * @date:03/11/22
 */
//declaring pacakge
package com.ques2;

//import package
import java.util.Scanner;

//declaring class
public class RoomBooking {
	
	//method for menu
	static void menu() {
		//menu for hotels
		System.out.println("------select hotel-------");
		System.out.println("1.3star");
		System.out.println("2.5star");
		System.out.println("3.exit");
	    
		//creating object of scanner
		Scanner sc=new Scanner(System.in);
		//taking input
		System.out.println("Enter choice ");
		int choice=sc.nextInt();
		
		//star switch
		switch(choice) {
		
		case 1:
			//taking input
			System.out.println("Enter room number ");
			int roomNumber=sc.nextInt();
			System.out.println("Enter room area ");
			double roomArea=sc.nextDouble();
			System.out.println("Enter acfacility true/false ");
			boolean acFacility=sc.nextBoolean();
			//creating object of hotel class
			HotelAbc h1=new HotelAbc(roomNumber,roomArea,acFacility);
			break;
			
		case 2:	
			  //taking input
            System.out.println("Enter room number ");
            roomNumber=sc.nextInt();
            System.out.println("Enter room area ");
            roomArea=sc.nextDouble();
            System.out.println("Enter acfacility true/false ");
             acFacility=sc.nextBoolean();
            System.out.println("Enter roomprice ");
             double roomPrice=sc.nextDouble();
			//menu for ooms
             System.out.println("-------select room------");
			System.out.println("1.normal");
			System.out.println("2.standard");
			System.out.println("3.deluxe");
			//taking input
			System.out.println("Enter choice ");
			int room=sc.nextInt();
			
			//start switch for rooms
			  switch(room){
				  case 1:
					  //creating object
				        HotelAbc h2=new HotelAbc(roomNumber,"normal",roomArea,acFacility,roomPrice);
				        //taking input for discount
				        System.out.println("enter discount percent");
						float discount=sc.nextFloat();
						//start if else
                           if(discount==0) {
							h2.setRoomPrice(roomPrice);//calling method setroomprice
							}
							else
								h2.setRoomPrice(roomPrice,discount); //calling method setroomprice
				        break;
				  case 2:
					//creating object
					  HotelAbc h3=new HotelAbc(roomNumber,"standard",roomArea,acFacility,roomPrice);
					  //taking input for discount
					  System.out.println("enter discount percent");
						 discount=sc.nextFloat();
						//start if else

						 if(discount==0) {
							h3.setRoomPrice(roomPrice);//calling method setroomprice}
							else
								h3.setRoomPrice(roomPrice,discount); //calling method setroomprice
				        break;  
					 
				  case 3 :
					//creating object
					  HotelAbc h4=new HotelAbc(roomNumber,"deluxe",roomArea,acFacility,roomPrice);
					  //taking input for discount
					  System.out.println("enter discount percent");
						 discount=sc.nextFloat();
						//start if else
						 if(discount==0) {
							h4.setRoomPrice(roomPrice);//calling method setroomprice
							}
							else
								h4.setRoomPrice(roomPrice,discount); //calling method setroomprice
				        break;   
					 
			}//end of second switch
			  break;
			  
		}//end of first switch
		
		}//end of method
	
//stat main
	public static void main(String[] args) {
		//calling menu method
		menu();

	}

}

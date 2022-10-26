/*
 * program:print tagline of it companies
 * @author:Ashish kumar sahu
 * @date:26/10/22
 */
//declaring package
package com.ques2;

import java.util.Scanner;

//declaing class
public class EnhancedSwitch {
	  static void companyName() 
	  {
	   //creating ocject
	    Scanner sc=new Scanner(System.in);
		String name;
	   //company name
	    System.out.println("1.Apple");   
	    System.out.println("2.Accenture");   
	    System.out.println("3.Adobe");   
	    System.out.println("4.Amzon");   
	    System.out.println("5.Microsoft");

		//taking input	
	    System.out.println("----Enter your company name----"); 
		name=sc.next().toUpperCase();
		
		//calling second method
		 tagLine(name);
	    	
	  }//end method
	  //start method
	  static void tagLine(String name) 
	  {
	   //start switch
	     switch(name)
	      {
		   case "APPLE":    System.out.println(name+"---Think different."); 
	               break;	   
		   case "ACCENTURE":System.out.println(name+"---High Performance. Delivered.");  
		           break;
		   case "ADOBE":    System.out.println(name+"---Better by Adobe.");  
		           break;
		   case "AMZONE":   System.out.println(name+"---… and You’re Done"); 
	               break;	   
		   case "MICROSOFT":System.out.println(name+"---Your potential. Our passion.");  
	  	           break; 
		   default:System.out.println("wrong input");  
		  
		  }//end switch
	  
	    	
	  }//end method

	//declaring main
	public static void main(String[] args) {
		//calling method  
		companyName();
		
	}//end main

}//end class

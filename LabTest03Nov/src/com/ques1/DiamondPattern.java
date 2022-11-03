/*
 * program:to print diamond pattern
 * @author:Ashish kumar sahu
 * @date:03/11/22
 */
//creating package
package com.ques1;

import java.util.Scanner;

//creating class
public class DiamondPattern {
	
	//method to print  diamond
	public static void pattern1(int num) {
	
	int j,i;
	
	    //start of outer loop for first half of diamond
		 for(i=0;i<num;i++) {
				System.out.println();//change of line
			
				//start of inner loop
				for(j=num-1;j>=i;j--) {
				 System.out.print(" ");//printing space
			 
				}//end of first inner loop
				
				//start second inner loop
				 for(j=1;j<i;j++) {
					 System.out.print("* ");//printing star
				 }//end of second inner loop
				
		 }//end of first outer loop
		 
		 //start of second outer loop for second half of diamond
		 for( i=num;i>0;i--) {
				System.out.println();//change of line
			 
				//start of first inner loop
				for(j=num-1;j>=i;j--) {
				 System.out.print(" ");
			 }//end of first inner loop
				 
				//start of second inner loop
				for(j=1;j<i;j++) {
					 System.out.print("* ");
				 }//end of second inner loop
				
			 }//end of second outer loop
		 
	}//end of method

	//start main
	public static void main(String[] args) {
		
		//creating object of scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking input
		System.out.println("enter the number");
	    int number=sc.nextInt();
	    //calling method
	    pattern1(number);
        sc.close();
	}//end of main

}//end class

/*
 * program:to crate a bank
 * @author:Ashish kumar sahu
 * @date:03/11/22
 */
//declaring package
package com.ques3;
//declaring class
//import scanner class
import java .util.Scanner;
public class Amount {

	//start main
	public static void main(String[] args) {
	//creating scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount");
		double amount= sc.nextDouble();
		
		//creating class object
		PiggyBank p1=new PiggyBank(amount);
		System.out.println("enter the amount to add");
		double addAmount= sc.nextDouble();
		p1.setAmount(addAmount);
		System.out.println(p1);
		sc.close();
	}//end main 

}//end class

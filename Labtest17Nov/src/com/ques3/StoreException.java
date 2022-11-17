/*
 * program:to chechk exception
 * @author:Ashish kumar sahu
 * @date:17/11/22
 */
//declaring package
package com.ques3;

//import packages
import java.util.*;

public class StoreException {
	void PlayingMenu()
	{
		System.out.println("enter your choice");
		System.out.println("1.cricket");
		System.out.println("1.cricket");
		System.out.println("1.cricket");
		
	}
	public static void main(String[] args) {
		StoreException se=new StoreException();
		se.PlayingMenu();
		try {
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println(choice);
		sc.close();
		
	}
	
	catch(ArithmeticException |  InputMismatchException e)
	{
		System.out.println(e.getMessage());
	}
	}

}

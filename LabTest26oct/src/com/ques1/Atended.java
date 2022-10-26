/*
 * program:to check the attendance
 * @author:Ashish kumar sahu
 * @date:26/10/22
 */
//declaring pakage
package com.ques1;

import java.util.Scanner;

//declaring class
public class Atended {

	
	//declaring first method
	public static void getDetails() {
	
	}
	
	//declaring  method printdetails
	public static void printDetails(float ch,float at) {
		System.out.println("----------------");
		System.out.println("total classes="+ch);
		System.out.println("classes attended="+at);
	}
	//declaring  method printdetails
	 public static void percentage(float ch,float at) {
		float per=0.0f;
		System.out.println("----------------");
		per=(at/ch)*100;
		System.out.println("atendance percentage="+per);
		 if(per>=75)
			 System.out.println("student can give exam");
		 else
			 System.out.println("student cannot give exam");
		
	}
	

	//start main
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaring variabels
		float classesHeld=0.0f,attended=0.0f;
		
		//taking input
		System.out.println("enter total number classes held");
		classesHeld=sc.nextFloat();
		System.out.println("enter the classes attended");
		attended=sc.nextFloat();
		
		
		//calling print details
		percentage(classesHeld,attended);
		
		//calling print details
		printDetails(classesHeld,attended);
		sc.close();
	}

}

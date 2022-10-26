/*
 * program:print employee details
 * @author:Ashish kumar sahu
 * @date:26/10/22
 */
//declaring package
package com.ques3.test;

import java.util.Scanner;

//importing package
 import com.ques3.Employee;

//declaring class
public class EmployeeTest {

	//start main
	public static void main(String[] args) {
		
		//creating object
		Employee e1=new Employee();
		
		Scanner sc=new Scanner(System.in);
		
		//declaring variabels
		int id;
		int salary;
		String name;
		String department;
		// taking input
				System.out.println("Enter the employe Name:");
				name = sc.next();
				System.out.println("Enter the employee Id:");
				id = sc.nextInt();
                System.out.println("Enter the department:");
				department = sc.next();
				System.out.println("Enter the salary:");
				salary = sc.nextInt();
		//calling method getdetails
				e1.getDetails(id, salary, name, department);
        //calling method print details
				e1.printDetails(id, salary, name, department);
				sc.close();
	}//end main

}//end class

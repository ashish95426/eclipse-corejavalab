/*
 * program:to ente the print details of manger and employee
 * @author:ASHISH KUMAR SAHU
 * @date:24/11/22
 */
//delaing package
package com.ques3;

//import package
import java.util.Scanner;

//member class
class Member {
	//declaring data types
	public String name;
	public int age;
	public String phone_number;
	public String address;
	public double salary;
	
	//method to print salary
	void print_salary(double salary)
	{
		System.out.println(salary);
	}

}
//class for employee
class Employee extends Member{
	 String Specialization;
     String department;
	Scanner sc=new Scanner(System.in);
	//method for employee details
	public void employeeDetails() { 
		System.out.println("------EMPLOYEE DETAILS--------");
		//taking input
		   System.out.println("enter the employee name");
		   String name=sc.next();
		   System.out.println("enter the employee department");
		   String department=sc.next();
		   System.out.println("enter the employee speclization");
		   String Specialization =sc.next();
		   System.out.println("enter the employee phone number");
		   String ph =sc.next();
		   System.out.println("enter the employee age");
		   int age=sc.nextInt();
		   System.out.println("enter the employee salary");
		   double salary=sc.nextDouble();
		   //printing details
		   System.out.println("employee name"+name);
		   System.out.println("employee department"+department);
		   System.out.println(" employee speclization"+Specialization);
		   System.out.println(" employee age"+age);
		   System.out.println(" employee phone number"+ph);
		   print_salary(salary);
	}
	
}
//class for maager
class Manager extends Member{
	public String Specialization;
	public String department;
	Scanner sc=new Scanner(System.in);
	//method for taking manger details
	public void managerDetails() {
		  System.out.println("------MANGER DETAILS--------");
		   System.out.println("enter the manager name");
		   String name=sc.next();
		   System.out.println("enter the manager department");
		   String department=sc.next();
		   System.out.println("enter the manger speclization");
		   String Specialization =sc.next();
		   System.out.println("enter the manger phone number");
		   String ph =sc.next();
		   System.out.println("enter the manger age");
		   int age=sc.nextInt();
		   System.out.println("enter the manger salary");
		   double salary=sc.nextDouble();
		   System.out.println("manger name"+name);
		   System.out.println("manger department"+department);
		   System.out.println(" manger speclization"+Specialization);
		   System.out.println(" manger age"+age);
		   System.out.println(" manger phone number"+ph);
		   print_salary(salary);
	}
}
public class tTest {

	public static void main(String[] args) {
		//objects for employee
		Employee emp=new Employee();
        emp.employeeDetails();
        //objects for manger
       Manager mn=new Manager();
       mn.managerDetails();
	}

}

/*
 * program:to ente the details of student and employee
 * @author:ASHISH KUMAR SAHU
 * @date:24/11/22
 */
//delaing package
package com.ques1;

import java.util.*;

//Student interface
interface Student{
	void studentDetails();
	
}
//employee interface
interface Employee{
	void employeeDetails();
	
	
}
//class for unversity 
 class University implements Student,Employee {
	 Scanner sc=new Scanner(System.in);
	 //taking employe details
		public void employeeDetails() {
			
		   System.out.println("enter the employee name");
		   String name=sc.next();
		   System.out.println("enter the employee department");
		   String department=sc.next();
		   System.out.println("enter the employee id");
		   int eId=sc.nextInt();
		   System.out.println("enter the employee salary");
		   double Salary=sc.nextDouble();
		   System.out.println("employee name"+name);
		   System.out.println("employee department"+department);
		   System.out.println(" employee id"+eId);
		   System.out.println(" employee salary"+Salary);
		}

		//taking student details
		public void studentDetails() {
			
			   System.out.println("enter the student name");
			   String name=sc.next();
			   System.out.println("enter the Student course");
			   String course=sc.next();
			   System.out.println("enter the Student id");
			   int sId=sc.nextInt();
			   System.out.println("enter the student age");
			   int age=sc.nextInt();
			   System.out.println("Student name"+name);
			   System.out.println("Student course:"+course);
			   System.out.println(" Student id"+sId);
			   System.out.println("Student age"+age);
			   
			
		}
	public static void main(String[] args) {
		University un=new University();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter s for student and e for Employee");
        char ch=sc.next().charAt(0);
        if(ch=='s') {
        	un.studentDetails();
        }
        else
        	un.employeeDetails();
	}



}

/*
 * program:to get the details of empolyee
 * @date:26/10/22
 *@author Ashish kumar sahu
 */
//declaring package
package com.ques3;

//declaring class
public class Employee {
	
	//instance variable
	int eid;
	int salary;
	String name;
	String department;
	
	
	//declaring method getdetails
	public  void getDetails(int id,int sl,String n,String de){
	   
		 eid=id;
	    salary=sl;
	     name=n;
	   department=de;
	   
	}
	//declaring method pintdetailsdetails
		public void printDetails(int id,int sl,String n,String de){
		//printing details 
		System.out.println("Employee details are");
		 System.out.println("Employee id"+eid);
		 System.out.println("Employee name:"+name);
		 System.out.println("Employee department:"+department);
		 System.out.println("Employee salary:"+salary);
		 
		}//end printdetails
	

}//end class

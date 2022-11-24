/*
 * program:to ente the pint parents and sub class
 * @author:ASHISH KUMAR SAHU
 * @date:24/11/22
 */
//delaing package
package com.ques2;

//parents class
 class ParentsClass{
	void printParent(){
		System.out.println("this is parent class");
	}
}
public class SubClass extends ParentsClass {
     void printSub() {
    	 System.out.println("this is child class");
     }
	public static void main(String[] args) {
		//objects of class
		ParentsClass pc=new ParentsClass();
        pc.printParent();
        SubClass sb=new SubClass();
        sb.printSub();
        ParentsClass ss=new SubClass();
        ss.printParent();

	}

}

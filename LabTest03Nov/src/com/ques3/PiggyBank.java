/*
 * program:to crate a bank
 * @author:Ashish kumar sahu
 * @date:03/11/22
 */
//declaring package
package com.ques3;

//declaring class
public class PiggyBank {
	//declaring instance variabels
	private double amount;
	
	//default constructor
	public PiggyBank() {
		super();
		System.out.println("default constructor");
		this.amount=50;
	}

// constructor with parameter
	public PiggyBank(double amount) {
		super();
		
		this.amount= amount;
	}
//method to get amount
	public double getAmount() {
		return amount;
	}//end method
//method to add amount
	public void setAmount(double amount) {
		this.amount+= amount;
	}//end method

	@Override
	public String toString() {
		return "totalamount=" + amount ;
	}

	
	

}//end class

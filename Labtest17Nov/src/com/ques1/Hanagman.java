/*
 * program:to create hang man game
 * @author:Ashish kumar sahu
 * @date:17/11/22
 */
//declaring package
package com.ques1;

//importscanner classs
import java.util.Scanner;

//declaring class
public class Hanagman {
	//method to play game
		void word()
		{
			//declaring variables
			int choice, length;
			char letter;
			String word;
			
			//creating Scanner object
			Scanner sc = new Scanner(System.in);
			
			System.out.println("!! Welcome To HANGMAN GAME !!");
			String[] words = {"ashish","laptop","java"};
			System.out.println("Enter a number between 1 to 3:");
			choice = sc.nextInt();
			length = words[choice-1].length();
			System.out.println("Enter the alphabet:");
			letter = sc.next().charAt(2);
			System.out.println(" Guess the word ");
			for(int i=0; i<length; i++)
			{
				if(letter == words[choice-1].charAt(i))
					System.out.print(letter + " ");
				else
					System.out.print("_ ");
			}
			System.out.println();
			word = sc.next();
			if(word.equalsIgnoreCase(words[choice-1]) == true)
				System.out.println(" Word matched.");
			else
				System.out.println(" Word mismatched.");
			sc.close();
		}

//start main
	public static void main(String[] args) {
		Hanagman hg=new Hanagman();
        hg.word();//calling method
	}//end main

}

package com.qa_calculator;
import java.util.Scanner;

// This is exercise 2 and 4 of the QA Java exercise booklet

public class Calculator {
	
	public static void calculator() {
		Scanner scannerObj1 = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int intInput1 = scannerObj1.nextInt();
		System.out.println("Enter the second number: ");
		int intInput2 = scannerObj1.nextInt();
		
		System.out.println("Would you like to add, subtract, multiply or divide? \nType 1 for add, 2 for subtract, 3 for multiply and 4 for divide: ");
		int userChoice = scannerObj1.nextInt();
		
		int result = 0;
		String choice = null;
		
		switch (userChoice) {
		case 1:
			result = intInput1 + intInput2;
			choice = "addition";
			break;
		case 2:
			result = intInput1 - intInput2;
			choice = "subtraction";
			break;
		case 3:
			result = intInput1 * intInput2;
			choice = "multiplication";
			break;
		case 4:
			result = intInput1 / intInput2;
			choice = "division";
			break;
		}

		System.out.println("The " + choice + "of " + intInput1 + " and " + intInput2 + " is: " + result);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator! \nThe console will ask you to input 2 numbers, followed by what you would like to do with these numbers.");
		calculator();
	}

}

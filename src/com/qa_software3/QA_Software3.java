package com.qa_software3;
import java.util.Scanner;

// This is exercise 3 of the QA Java exercise booklet.

public class QA_Software3 {
	
	public static void checkString() {
		String hardCode = "Hello World";
		
		Scanner scannerObj1 = new Scanner(System.in);
		System.out.println("Type out Hello World: ");
		String userInput = scannerObj1.nextLine();
		
		if (userInput.equals(hardCode)) {
			System.out.println("You typed it out correctly! \nHurray!");
		}else {
			System.out.println("You typed it out incorrectly... How?!!!");
		}
		
	}
	
	public static void checkString2() {
		Scanner scannerObj2 = new Scanner(System.in);
		System.out.println("Type out the first string: ");
		String userInput1 = scannerObj2.nextLine();
		System.out.println("Type out the second string: ");
		String userInput2 = scannerObj2.nextLine();
		
		if (userInput1.equals(userInput2)) {
			System.out.println("Both strings match! \nHurray!");
		}else {
			System.out.println("The strings do not match... \nBoooo!");
		}
	}

	public static void main(String[] args) {
		System.out.println("This is a programme that will check if you can input Hello World correctly.\n");
		checkString();
		System.out.println("\n\nNow type out two strings and the programme will determine whether they match.\n");
		checkString2();

	}

}

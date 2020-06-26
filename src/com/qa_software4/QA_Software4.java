package com.qa_software4;

public class QA_Software4 {
	
	public static void numCoverter() {
		String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] tens = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
		String[] hundreds = { "", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred",
				"Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred" };
		
		for (int i = 0; i < 1000; i++) {
			if (i > 99 &&  i % 100 > 19) {
				System.out.println("" + hundreds[i / 100] + " " + tens[i / 10 % 10] + " " + units[i % 10]);
			} else if (i > 99) {
				System.out.println("" + hundreds[i / 100] + " " + units[i % 100]);
			} else if (i > 19) {
				System.out.println("" + tens[i / 10] + " " + units[i % 10]);
			} else if (i < 20) {
				System.out.println(units[i]);
			} 
		}
	}

	public static void main(String[] args) {
		numCoverter();
	}
}

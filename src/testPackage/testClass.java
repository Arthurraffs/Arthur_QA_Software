package testPackage;

public class testClass {

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub

		public String multiChar(String input) {
			
			for(int i = 0; i <= input.charAt(input.length() - 1); i++) {
				char singleChar = input.charAt(i);
				
				System.out.println(singleChar);
			}
			return input;
			
	}
}


package Conditions;



public class nested_ifelse {
	public static void main(String[] args) {

		int num =2;

		// Outer if statement
		if (num != 0) {
			// Inner (nested) if-else statement
			if (num % 2 == 0) {
				System.out.println("The number is even.");
			} else {
				System.out.println("The number is  odd.");
			}
		} else {
			System.out.println("The number is zero.");
		}

		
	}
}

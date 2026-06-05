package Conditions;

import java.util.Scanner;

public class ladderc {
	public static void main(String[] args) {
		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks to know your Grade");

			double percent = sc.nextDouble();

			if (percent >= 80) {
				System.out.println("Grade A");
			} else if (percent >= 60) {
				System.out.println("Grade B");
			} else if (percent >= 35) {
				System.out.println("Grade C");
			} else {
				System.out.println("Fail");
			}
			sc.close();
		}

	}
}

package Conditions;

import java.util.Scanner;

public class Ladder_Else_if_condition {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks");

			int marks = sc.nextInt();

			if (marks >= 90) {
				System.out.println("Grade A");
			} else if (marks >= 70) {
				System.out.println("Grade B");
			} else if (marks >= 35) {
				System.out.println("Grade C");
			} else if (marks <= 35) {
				System.out.println("Fail");
			}
		}
	}
}
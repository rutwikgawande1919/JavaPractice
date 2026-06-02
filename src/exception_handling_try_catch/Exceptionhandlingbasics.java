package exception_handling_try_catch;

import java.util.Scanner;

public class Exceptionhandlingbasics {
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a");
			int a = sc.nextInt();

			System.out.println("Enter b");
			int b = sc.nextInt();

			try {
				System.out.println("Division :" + (a / b));

			}catch(ArithmeticException e) {
				System.out.println("dont enter b value zero");
			}
			
		}

	}
}

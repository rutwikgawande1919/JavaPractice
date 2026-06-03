package exception_handling_try_catch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Operation {
	public static void main(String[] args) {
		int a = 12;
		int b = 3;

		System.out.println("Start");
		try {
			int div = a / b;
			System.out.println(div);
			FileReader f = new FileReader("abc.txt");
			System.out.println(f);
//runtime exception
		} catch (ArithmeticException e) {
			System.out.println("dont enter b value zero" + e);
		}
//compiletime exception		
		catch (FileNotFoundException e) {
			System.out.println("file not exixt" + e);
		}

		System.out.println("ENd");

	}
}

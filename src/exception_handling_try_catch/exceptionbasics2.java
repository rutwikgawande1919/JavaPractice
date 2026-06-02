package exception_handling_try_catch;

public class exceptionbasics2 {
public static void main(String[] args) {
	
	System.out.println("Start");
	String name="Rutwik";
	
	try {
		for(int i=0;i<=name.length();i++) {
			System.out.println(name.charAt(i));
		}
	}catch(IndexOutOfBoundsException e) {
		System.out.println("String value excedded"+e);
	}
	
	
	
	System.out.println("End");
}
}

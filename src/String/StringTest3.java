package String;

public class StringTest3 {
public static void main(String[] args) {
	String name="RUTWIK";
	
	int length=name.length();
	System.out.println(length);
	
	char ch =name.charAt(3);
	System.out.println(ch);
	
	
	for(int a=0;a<name.length();a++) {
		System.out.println(name.charAt(a));
	}
			
}
}

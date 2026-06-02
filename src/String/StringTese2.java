package String;

public class StringTese2 {
public static void main(String[] args) {
	String name="Rutwik";
	
	int length=name.length();
	System.out.println(length);
	
	System.out.println("====================");
	
	char ch =name.charAt(4);
	System.out.println(ch);
	
	System.out.println("====================");
	
	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
	}
}
}

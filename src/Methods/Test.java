package Methods;

public class Test {
public static void main(String[] args) {
	Operation o = new Operation();
	o.Addition();
	
	o.multiplication(16, 15);
	
	int value =o.Division(10, 1);
	System.out.println("Division is :"+value);
	
	int substract=o.Substraction();
	System.out.println("Substraction is :"+substract);
	
}
}

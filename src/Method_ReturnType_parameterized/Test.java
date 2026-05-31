package Method_ReturnType_parameterized;

public class Test {
public static void main(String[] args) {
	Operation o=new Operation();
	
	int sum=o.Addition(15, 13);
	System.out.println("Addition is :"+sum);
	
	
	int substract=o.Substracrion(19, 13);
	System.out.println("Substraction is :"+substract);
	
	int division=o.Division(16, 15);
	System.out.println("Division is :"+division);
	
	int mod=o.Mod(17, 15);
	System.out.println("Mod is :"+mod);
}
}

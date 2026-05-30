package Methods_ReturnType;

public class Test {

	public static void main(String[] args) {
		Operation o =new Operation();
		int op =o.Sum();
		System.out.println("sum is :"+op);
		
		int sub = o.substract();
		System.out.println("Substraction is :"+sub);
	}
}

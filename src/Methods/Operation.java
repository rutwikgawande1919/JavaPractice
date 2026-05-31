package Methods;

public class Operation {

//void non-parameterized method	
	public void Addition() {
		int a=12;
		int b=15;
		int sum=a+b;
		System.out.println("Addition is :"+sum);
	}

//void parameterized method	
	public void multiplication(int a,int b) {
		int multi=a*b;
		System.out.println("multiplication is :"+multi);
	}
	
//return type parameterized method
	public int Division(int a,int b) {
		int division=a/b;
		return division;
	}
//return type non-parameterized method
	public int Substraction() {
		int a=100;
		int b=17;
		int substract=a-b;
		return substract;
	}
}

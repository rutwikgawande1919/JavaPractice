package thisSomething_SuperSomething_keyword;

public class Employee1 extends Director1{

	public int age =22;
	
	public void getage() {
		System.out.println("Employee age :25");
	}
	
	public void something() {
		System.out.println("Sometning called");
		System.out.println(this.age);
		System.out.println(super.age);
		this.getage();
		super.getage();
	}
	
}

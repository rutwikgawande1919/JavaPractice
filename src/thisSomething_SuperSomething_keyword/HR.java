package thisSomething_SuperSomething_keyword;

public class HR extends Employee{

	public int age =4000;
	
	public void getage() {
		System.out.println("60");
	}		
	
	public void something() {
		System.out.println("something called");
		System.out.println(this.age);
		System.out.println(super.age);
		this.getage();
		super.getage();
		
	}
	
	
}

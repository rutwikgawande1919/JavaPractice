package thisSomething_SuperSomething_keyword;

public class Developer3 extends Employee3 {

	int age = 23;

	public void getage() {
		System.out.println("Developer = 23");
	}
	
	public void somethingcalled() {
		System.out.println("Called");
		System.out.println(this.age);
		System.out.println(super.age);
		this.getage();
		super.getage();
	}
}

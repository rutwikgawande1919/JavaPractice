package thisSomething_SuperSomething_keyword;

public class Developer2 extends Employee2{

	public int age=38;
	
	public void getage() {
		System.out.println("Developer 37");
	}
	public void somethong() {
       System.out.println("something called");
       System.out.println(this.age);
       System.out.println(super.age);
       this.getage();
       super.getage();
}
}
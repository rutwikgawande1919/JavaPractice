package Inheritance1;

public class Test {

	public static void main(String[] args) {
		Employee e;
		
		e= new Employee();
		e.Salary();
		
		e= new Developer();
		e.Salary();
		
		e=new HR();
		e.Salary();
	}
}

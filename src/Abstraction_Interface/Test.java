package Abstraction_Interface;

public class Test {
	public static void main(String[] args) {
		int salary=10000;
		
		Employee e;
		
		e= new Developer();
		e.givesalary(salary);
		e.getname();
		
		e= new HR();
		e.givesalary(salary);
		e.getname();
	}
}

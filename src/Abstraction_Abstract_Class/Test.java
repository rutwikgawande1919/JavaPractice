package Abstraction_Abstract_Class;

public class Test {

	public static void main(String[] args) {
		int salary=10000;
		
		Employee e;
		
		e=new Developer();
		e.giveSalary(salary);
		e.getname();
		
		e= new HR();
		e.giveSalary(salary);
		e.getname();
	}

}

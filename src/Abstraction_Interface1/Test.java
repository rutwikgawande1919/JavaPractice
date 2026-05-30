package Abstraction_Interface1;

public class Test {
public static void main(String[] args) {
	int salary =15000;
	Employee e;
	
	e= new HR();
	e.getname();
	e.givesalary(salary);
	
	e= new Developer();
	e.getname();
	e.givesalary(salary);
}
}

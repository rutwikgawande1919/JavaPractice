package Abstraction_Abstract_Class1;

public class Test2 {
public static void main(String[] args) {
	int salary=20000;
	
	Employee2 e;
	
	e=new Developer2();
	e.getname();
	e.givesalary(salary);
	
	e=new HR2();
	e.getname();
	e.givesalary(salary);
	
}
}

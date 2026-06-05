package Abstraction_Abstract_Class;

public class Test3 {
public static void main(String[] args) {
	int salary=40000;
	Employee3 e;
	
	e=new Developer3();
	e.getname();
	e.givesalary(salary);
	
	e=new HR3();
	e.getname();
	e.givesalary(salary);
}
}

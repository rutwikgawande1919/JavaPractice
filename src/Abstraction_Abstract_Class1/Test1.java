package Abstraction_Abstract_Class1;

public class Test1 {
public static void main(String[] args) {
	int salary=10000;
	Employee1 e;
	
	e=new Developer1();
	e.getname();
	e.givesalary(salary);
	
	e=new HR1();
	e.getname();
e.givesalary(salary);	
	
	
	
}
	
}

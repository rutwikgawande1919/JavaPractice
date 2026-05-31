package Abstraction_Interface;

public class Test1 {
public static void main(String[] args) {
	int salary =10000;
	Employee1 e;
	
	e=new Developer1();
	e.getname();
	e.Givesalary(salary);
	
	
	e=new HR1();
	e.getname();
	e.Givesalary(salary);
}
}

package Abstraction_Abstract_Class;

public class Test2 {
public static void main(String[] args) {
	int salary=15000;
	Employee2 e;
	
	e=new Driver2();
    e.getname();
	e.givesalary(salary);
	
	e=new Piyun2();
	e.getname();
	e.givesalary(salary);
}
}

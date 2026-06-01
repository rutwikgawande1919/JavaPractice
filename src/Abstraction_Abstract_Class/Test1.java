package Abstraction_Abstract_Class;

public class Test1 {
public static void main(String[] args) {
	int salary=20000;
	Employee1 e;
	
	e=new Surveyour1();
	e.getname();
	e.givesalary(salary);
	
	e=new Engineer1();
	e.getname();
	e.givesalary(salary);
}
}

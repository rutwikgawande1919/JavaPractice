package Polymorphism_Runtime_Overriding;

public class Test1 {
public static void main(String[] args) {
	Employee e;
	
	e=new Employee();
	e.givesalary();
	
	e=new Developer();
	e.givesalary();
	
	
	e= new HR();
	e.givesalary();
}
}

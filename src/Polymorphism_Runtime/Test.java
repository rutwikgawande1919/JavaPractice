package Polymorphism_Runtime;

public class Test {
public static void main(String[] args) {
	Employee e;
	
	e=new Developer();
	e.givesalary();
	
	e= new HR();
	e.givesalary();
}
}

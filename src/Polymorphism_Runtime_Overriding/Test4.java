package Polymorphism_Runtime_Overriding;

public class Test4 {
public static void main(String[] args) {
	Employee4 e ;
	
	
	e=new Employee4();
	e.givesalary();
	
	e=new Developer4();
	e.givesalary();
	
	e= new HR4();
	e.givesalary();
}
}

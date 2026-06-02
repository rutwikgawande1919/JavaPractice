package Polymorphism_Runtime_Overriding;

public class Test3 {
public static void main(String[] args) {
	Employee3 e;
	
	e= new Employee3();
	e.givesalary();
	
	e=new Driver3();
	e.givesalary();
	
	e=new Piyun3();
	e.givesalary();
}
}

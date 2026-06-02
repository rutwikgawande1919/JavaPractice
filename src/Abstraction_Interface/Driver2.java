package Abstraction_Interface;

public class Driver2 implements Employee2{

	@Override
	public void getname() {
		System.out.println("Driver datta");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary;
		System.out.println(salary);
		
	}

}

package Abstraction_Interface;

public class HR implements Employee{

	@Override
	public void givesalary(int salary) {
		salary=salary/10;
		System.out.println(salary);
		
	}

	@Override
	public void getname() {
		System.out.println("HR");
		
	}

}

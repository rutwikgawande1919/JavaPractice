package Abstraction_Interface1;

public class HR implements Employee{

	@Override
	public void getname() {
		System.out.println("HR :ravi");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary/10;
		System.out.println(salary);
		
	}

}

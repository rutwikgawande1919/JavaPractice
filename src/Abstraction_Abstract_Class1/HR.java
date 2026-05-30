package Abstraction_Abstract_Class1;

public class HR extends Employee{

	@Override
	public void getname() {
		System.out.println("HR :Shrikant" );
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary/10;
		System.out.println(salary);
		
	}

}

package Abstraction_Abstract_Class1;

public class HR1 extends Employee1{

	@Override
	public void getname() {
		System.out.println("HR1=pratik");
		
	}

	@Override
	public void givesalary(int salary) {
	salary=salary/10;
	System.out.println(salary);
		
	}

}

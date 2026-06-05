package Abstraction_Abstract_Class;

public class HR3 extends Employee3{

	@Override
	public void getname() {
		System.out.println("HR");
		
	}

	@Override
	public void givesalary(int salary) {
		//salary=salary/2;
		System.out.println(salary);
		
	}

}

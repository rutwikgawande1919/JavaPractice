package Abstraction_Abstract_Class;

public class Developer3 extends Employee3{

	@Override
	public void getname() {
		System.out.println("Developer");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary*2;
		System.out.println(salary);
		
	}

}

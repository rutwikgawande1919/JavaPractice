package Abstraction_Interface;

public class Developer3 implements Employee3{

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

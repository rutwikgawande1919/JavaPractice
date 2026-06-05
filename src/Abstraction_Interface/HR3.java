package Abstraction_Interface;

public class HR3 implements Employee3{

	@Override
	public void getname() {
	System.out.println("HR");
		
	}

	@Override
	public void givesalary(int salary) {
		System.out.println(salary);
		
	}

}

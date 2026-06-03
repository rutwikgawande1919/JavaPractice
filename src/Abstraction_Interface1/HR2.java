package Abstraction_Interface1;

public class HR2 implements Employee2{

	@Override
	public void getname() {
		System.out.println("HR");
		
	}

	@Override
	public void givesalary(int salary) {
        salary=salary/2;
        System.out.println(salary);
		
	}

}

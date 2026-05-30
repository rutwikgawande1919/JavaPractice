package Abstraction_Interface1;

public class Developer implements Employee{

	@Override
	public void getname() {
		System.out.println("Developer :sonu");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary*10;
		System.out.println(salary);
		
	}

}

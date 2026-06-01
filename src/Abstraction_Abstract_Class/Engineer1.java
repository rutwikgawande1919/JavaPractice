package Abstraction_Abstract_Class;

public class Engineer1 extends Employee1{

	@Override
	public void getname() {
		System.out.println("Engineer RAHUL");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary*2;
		System.out.println(salary);
		
	}

}

package Abstraction_Abstract_Class;

public class Piyun2 extends Employee2{

	@Override
	public void getname() {
		System.out.println("piyun = khapya");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary/2;
		System.out.println(salary);
	}

}

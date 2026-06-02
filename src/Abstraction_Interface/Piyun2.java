package Abstraction_Interface;

public class Piyun2 implements Employee2{

	@Override
	public void getname() {
		System.out.println("Piyun shama");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary/2;
		System.out.println(salary);
	}

}

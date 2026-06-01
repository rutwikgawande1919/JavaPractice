package Abstraction_Interface1;

public class Driver implements Employee1{

	@Override
	public void getname() {
       System.out.println("Rutwik");		
	}

	@Override
	public void getname1() {
       System.out.println("Kiran");		
	}

	@Override
	public void givesalary(int salary) {
		int a =salary;
		System.out.println(a);
		
	}

	@Override
	public void givesalary1(int salary1) {
		salary1=salary1*2;
		System.out.println(salary1);
		
	}

}

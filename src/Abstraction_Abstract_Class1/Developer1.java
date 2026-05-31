package Abstraction_Abstract_Class1;

public class Developer1 extends Employee1{

	@Override
	public void getname() {
		System.out.println("Developer1=sumit");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary*10;
		System.out.println(salary);
		
	}

}

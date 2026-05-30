package Abstraction_Abstract_Class1;

public class Developer extends Employee{

	@Override
	public void getname() {
		System.out.println("Developer :Rahul");
		
	}

	@Override
	public void givesalary(int salary) {
		salary=salary*10;
System.out.println(salary);		
	}

}

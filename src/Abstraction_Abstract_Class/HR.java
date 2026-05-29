package Abstraction_Abstract_Class;

public class HR extends Employee
{

	@Override
	public void giveSalary(int salary) {
        salary = salary/10;
        System.out.println(salary);
	}

	@Override
	public void getname() {
           System.out.println("HR");		
	}

}

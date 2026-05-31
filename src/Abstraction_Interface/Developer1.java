package Abstraction_Interface;

public class Developer1 implements Employee1{

	@Override
	public void getname() {
		System.out.println("Developer1 = pranav");
		
	}

	@Override
	public void Givesalary(int salary) {
		salary=salary*10;
		System.out.println(salary);
		
	}

}

package Abstraction_Interface;

public class HR1 implements Employee1{

	@Override
	public void getname() {
		System.out.println("HR1 =yumna khan");
		
	}

	@Override
	public void Givesalary(int salary) {
		salary=salary/10;
		System.out.println(salary);
		
	}

}

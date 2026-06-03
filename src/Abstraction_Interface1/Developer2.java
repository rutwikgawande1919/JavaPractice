package Abstraction_Interface1;

public class Developer2 implements Employee2{

	@Override
	public void getname() {
		System.out.println("Developer");
		
	}

	@Override
	public void givesalary(int salary) {
      salary=salary*2;
      System.out.println(salary);
		 
	}

}

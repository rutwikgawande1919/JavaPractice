package this_super_keyword;

public class Employee {

	public Employee() {
		super();
		System.out.println("Employee constructor");
        
	}
	
	public Employee(int a) {
		System.out.println("parent constructor :"+a);
	}

}

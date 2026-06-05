package Polymorphism_compiletime_Overloading;

public class Details5 {

	public void Details(String name) {
		System.out.println("Details :"+name);
	}
	public void Details(String name,String mname) {
		System.out.println("Details :"+(name+mname));
		
	}
	public void Details(String name,String mname,String fname) {
		System.out.println("Details :"+(name+mname+fname));
	}
	public void Details(String name,String mname,String fname,String sname) {
		System.out.println("Details :"+name+mname+fname+sname);
	}
}

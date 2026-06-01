package Polymorphism_Runtime_Overriding;

public class Test2 {
public static void main(String[] args) {
	Friends2 f;
	
	f=new Shrikant2();
	f.givesalary();
	
	f=new Kartik2();
	f.givesalary();
	
}
}

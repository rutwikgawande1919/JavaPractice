package Polymorphism_Runtime_Overriding;

public class Test5 {
public static void main(String[] args) {
//Class load
	Husband5 h;
	
//Husband/parent class object create	
    h=new Husband5();
	h.name();
//Wife/child class object create
	h=new Wife5();
	h.name();
//Child/child class object create
	h=new Child5();
	h.name();
	
	
}
}

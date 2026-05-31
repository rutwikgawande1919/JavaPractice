package Polymorphism_compiletime_Overloading;

public class Calculator1 {

	public void Sum(int a,int b) {
		System.out.println("Sum :"+(a+b));
	}
	
	public void Sum(int a,int b,int c) {
		System.out.println("Sum :"+(a+b+c));
	}
	
	
	public void Substraction(int a,int b) {
		System.out.println("Substraction is :"+(a-b));
	}
	
	public void Substraction(int a,int b,int c) {
		System.out.println("Substraction is :"+(a-b-c));
	}
}

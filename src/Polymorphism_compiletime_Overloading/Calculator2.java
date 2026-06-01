package Polymorphism_compiletime_Overloading;

public class Calculator2 {
//Addition
	public void sum(int a,int b) {
		System.out.println("sum :"+(a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("sum :"+(a+b+c));
	}
	
//substraction	
	public void substraction(int a,int b) {
		System.out.println("substract :"+(a-b));
	}
	
	public void substraction(int a,int b,int c) {
		System.out.println("substract :"+(a-b-c));
	}
	
//Dicision
	public void Division(int a,int b) {
		System.out.println("division :"+(a/b));
	}
	
	public void Division(int a,int b,int c) {
		System.out.println("division :"+(a/b/c));
	}
}

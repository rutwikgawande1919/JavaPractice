package Polymorphism_compiletime_Overloading;

public class Calculator4 {
	
	public void sum(int a, int b) {
		System.out.println("sum :"+(a+b));
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("sum :"+(a+b+c));
	}
	
	public void Division(int a,int b) {
		System.out.println("division"+(a/b));
	}
	public void Division(int a,int b,int c) {
		System.out.println("division"+(a/b/c));
	}
	
	
}

package Polymorphism_compiletime_Overloading;

public class Calculator {

//sum	
	public void sum(int a,int b) {
		System.out.println("sum :"+(a+b));
	}
	public void sum(int a,int b,int c) {
		System.out.println("sum :"+(a+b+c));
	}
	public void sum(int a,int b,int c,int d) {
		System.out.println("sum :"+(a+b+c+d));
	}
	
//substraction
	public void substract(int a,int b) {
		System.out.println("substract :"+(a-b));
	}
	public void substract(int a,int b,int c) {
		System.out.println("substract :"+(a-b-c));
	}
	public void substract(int a,int b, int c,int d) {
		System.out.println("substract :"+(a-b-c-d));
	}
}

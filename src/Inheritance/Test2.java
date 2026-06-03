package Inheritance;

public class Test2 {
public static void main(String[] args) {
	
//parent object	
	Parent2 p=new Parent2();
	System.out.println(p.a);
	p.name1();
	System.out.println("=============");

//child object	
	child2 ch =new child2();
	System.out.println(ch.a);
	System.out.println(ch.b);
	ch.name1();
	ch.name();
	
	System.out.println("=============");

//hybrid object	
	Parent2 p1=new child2();
	System.out.println(p1.a);
	p1.name1();
	
}
}

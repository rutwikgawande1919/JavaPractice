package Inheritance1;

public class Test1 {
public static void main(String[] args) {
	Parent1 p =new Parent1();
	System.out.println(p.a);
	p.getname();
	
	Child1 ch=new Child1();
	System.out.println(ch.a);
	System.out.println(ch.b);
	ch.getname();
	
	Parent1 p1=new Child1();
	System.out.println(p1.a);
	p1.getname();
	
}
}

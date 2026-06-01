package Inheritance;

public class Test1 {
public static void main(String[] args) {
	 
	parent1 p=new parent1();
	System.out.println(p.a);//12
	p.name1();//parent
	System.out.println("=================");
	
	Child1 c=new Child1();
	System.out.println(c.b);//15
	c.name1();//child
	System.out.println("=================");
	
	parent1 p1=new Child1();
	System.out.println(p1.a);//12
	p1.name1();//child

	
}
}

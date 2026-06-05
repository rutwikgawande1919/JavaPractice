package Inheritance;

public class Test3 {
public static void main(String[] args) {
	
	Parent3 pp=new Parent3();
	System.out.println(pp.p);
	pp.getname();
System.out.println("==================");
	Child3 ch=new Child3();
	System.out.println(ch.p);
	System.out.println(ch.c);
	ch.getname();
System.out.println("==================");	
     Parent3 pc=new Child3();
     System.out.println(pc.p);
     pc.getname();
}
}

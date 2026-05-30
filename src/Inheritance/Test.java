package Inheritance;

public class Test {
	public static void main(String[] args) {

//parent object		
		Student s = new Student();
          System.out.println(s.a);
          System.out.println("=============");
          
//Child object          
        Rutwik r = new Rutwik();
        System.out.println(r.a);
        System.out.println(r.b);
        r.Name1();
        
//Hybrid object
        Student s1 = new Rutwik();
        System.out.println(s1.a);
        s1.Name1();
	}
}

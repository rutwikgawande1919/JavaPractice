package Encapsulation2;

public class Test {
public static void main(String[] args) {
	StudentRecord s = new StudentRecord();
	s.setStudentid(101);
	s.setStudentname("shiv");
	s.setAcademicscore(97.15);
	
	System.out.println(s.getStudentid());
	System.out.println(s.getStudentname());
	System.out.println(s.getAcademicscore());
}
}

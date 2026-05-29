package Encapsulation;

public class Test {
	
public static void main(String[] args) {
	Teacher t = new Teacher();
	t.setTeachergander("Male");
	t.setTeachername("Dhande sir");
	
	School s1 = new School();
	s1.setSchoolname("SWami vivekanand");
	s1.setSchoolcity("Akot");
	
	
	Student s=new Student();
	s.setName("Rutwik");
	s.setName1("Abhishek");
	s.setTeacher(t);
	s.setSchool(s1);
	
	System.out.println(s.getName());
	System.out.println(s.getName1());
	System.out.println(s.getTeacher().getTeachername());
	System.out.println(s.getTeacher().getTeachergander());
	System.out.println(s.getSchool().getSchoolname());
	System.out.println(s.getSchool().getSchoolcity());
	
	
}
	

}

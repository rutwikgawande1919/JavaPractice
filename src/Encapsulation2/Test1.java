package Encapsulation2;

public class Test1 {
public static void main(String[] args) {
	
	
	Company c=new Company();
	c.setCompanyname("hero");
	c.setCompany1name("Honda");
	
	Milage m=new Milage();
	m.setMilage(60);
	m.setMilage1(54);
	
	
	Bike b = new Bike();
	
	b.setBikename("splendor");
	b.setBikename1("shine");
	b.setCompany(c);
	b.setMilage(m);
	
	System.out.println(b.getBikename());
	System.out.println(b.getCompany().getCompanyname());
	System.out.println(b.getMilage().getMilage());
	System.out.println(b.getBikename1());
	System.out.println(b.getCompany().getCompany1name());
	System.out.println(b.getMilage().getMilage1());
	
	
	
}
}

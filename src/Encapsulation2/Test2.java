package Encapsulation2;

public class Test2 {
public static void main(String[] args) {
	Parent p = new Parent();
	p.setFname("Ravindra");
	p.setMname("Sharda");
	
	
	Home h =new Home();
	h.setVillagename("Maroda");
	h.setAddress("near datta mandir");
	
	
	Children c=new Children();
	
	c.setName("Rutwik");
	c.setName1("pranav");
	c.setParent(p);
	c.setHome(h);
	
	System.out.println(c.getName());
	System.out.println(c.getName1());
	System.out.println(c.getParent().getFname());
	System.out.println(c.getParent().getMname());
	System.out.println(c.getHome().getVillagename());
	System.out.println(c.getHome().getAddress());
	
	
}

}

package Encapsulation1;

public class Test1 {
	public static void main(String[] args) {
		Owner1 o = new Owner1();
		o.setOwnername("Pranav patil");

		Laptop1 lp = new Laptop1();
		lp.setLaptopname("vivobook 15");

		Company1 c = new Company1();
		c.setCompany1("Asus");
		c.setLaptop1(lp);
		c.setOwner1(o);
		
		System.out.println(c.getCompany1());
		System.out.println(c.getLaptop1().getLaptopname());
		System.out.println(c.getOwner1().getOwnername());
	}
}

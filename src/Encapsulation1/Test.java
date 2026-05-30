package Encapsulation1;

public class Test {
	public static void main(String[] args) {

		Owner o = new Owner();
		o.setOwner("RUtwik Gawande");
		
		Car c1 = new Car();
		c1.setCarname("Mercedez Benz GLE 300d");
		
          company c =new company();
          c.setCompany("Mercedez");
          c.setCar(c1);
          c.setOwner(o);
          
          
          System.out.println("Car company is :"+c.getCompany());
          System.out.println("Car model is :"+c.getCar().getCarname());
          System.out.println("Car owner name is :"+c.getOwner().getOwner());
	}
}

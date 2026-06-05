package Encapsulation3;

public class Test {
	public static void main(String[] args) {
		Company c = new Company();
		c.setCompanyname("Asus");

		Model m = new Model();
		m.setCompanymodel("Amd ryzen 5");

		Laptop l = new Laptop();
		l.setLaptopname("Asus vivobook 15");
		l.setModel(m);
		l.setCompany(c);
		
		
		System.out.println("Laptop name :"+l.getLaptopname());
		System.out.println("Laptop company :"+l.getCompany().getCompanyname());
		System.out.println("Laptop model :"+l.getModel().getCompanymodel());
	}
}

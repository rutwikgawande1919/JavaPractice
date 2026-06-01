package Encapsulation;

public class Test1 {
	public static void main(String[] args) {

		Company c1=new Company();
		c1.setCompany("company of cloths =Blackberry");
		
		cloths c = new cloths();
		
		c.setPant("formal pant");
		c.setShirt("formal shirt");
		c.setComp(c1);
		
		
		System.out.println(c.getShirt());
		System.out.println(c.getPant());
		System.out.println(c.getComp().getCompany());
	}
}

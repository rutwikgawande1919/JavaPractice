package Encapsulation3;

public class Laptop {

	private String laptopname;
	private Company company;
	private Model model;

	public String getLaptopname() {
		return laptopname;
	}

	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}

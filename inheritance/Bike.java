package inheritance;

public class Bike{
	
	 String name;
	 int milage;
	 double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		if(milage>this.milage) {
		this.milage = milage;
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	public void moving() {
		System.out.println("Bike is moving");
	}
	
	public Bike(String name, int milage, double price) {
		this.name = name;
		this.milage = milage;
		this.price = price;
	}
	
	

}

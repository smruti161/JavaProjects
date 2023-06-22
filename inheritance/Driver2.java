package inheritance;

public class Driver2 {
	
	public static void main(String[] args) {
		
		Square s=new Square();
		Rectangle r=new Rectangle();
		AreaCalculator a=new AreaCalculator();
		a.calculateArea(s);
	    a.calculateArea(r);
		}

}

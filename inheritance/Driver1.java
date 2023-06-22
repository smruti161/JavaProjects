package inheritance;

public class Driver1 {
	
	public static void main(String[] args) {
		
		Bike b1=new Bike("jawa",30,250000.0);
		Bike b2=new Bike("hunter",32,270000.0);
		Bike b3=new Bike("Mt15",40,220000.0);
		Bike[] b= {b1,b2,b3};
		double largest =b[0].price;
		for(int i=0; i<b.length; i++)
		{
			if(b[i].price>largest)
			{
			System.out.println(b[i].name);
			System.out.println(b[i].milage);
			System.out.println(b[i].price);
			b[i].moving();
			}
		}
	}
}

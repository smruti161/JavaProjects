package multiDArray;

public class Driver1 {
	public static void main(String[] args) {
		Actor a1=new Actor("salman",55,50000.0);
		Actor a2=new Actor("varun",35,70000.0);
		Actor a3=new Actor("ram",45,40000.0);
		a1.setSalary(200000.0);
		displayDetails(a1);
		displayDetails(a2);
		displayDetails(a3);
	}
	public static void displayDetails(Actor a)
	{
		System.out.println("Name :"+a.getName());
		System.out.println("Age :"+a.getAge());
		System.out.println("Salary :"+a.getSalary());
		a.working();
		System.out.println("====================");
	}
}

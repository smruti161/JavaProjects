package multiDArray;

public class Actor {
	String name;
	int age;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary>this.salary)
		{
			this.salary=salary;
		}
	}
	public void working()
	{
		System.out.println(name+" is a actor");
	}
	public Actor(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
}

package inheritance;

public class Employee {
	
	String name;
	int eid;
	double salary;
	 Employee(String name, int eid, double salary) {

		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}
	public String toString()
	{
		return "Name :"+name+" Eid :"+eid+" Salary :"+salary;
	}
	
	public boolean equals(Object obj)
	{
		return this.eid==((Employee) obj).eid;
	}
}

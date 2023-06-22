package homeWork;

public class Driver2 {
	public static void main(String[] args) {
		Employee e1=new Employee("Smruti",104,300.00);
		Employee e2=new Employee("Biswajit",108,40000.0);
		Employee e3=new Employee("Ajit",104,35000.0);
		Employee [] e= {e1,e2,e3};
        double largest=e[0].salary;
        for(int i=0; i<e.length; i++)
        {
        	if(e[i].salary>largest)
        	{
        		largest=e[i].salary;
        	}
        }
        System.out.println(largest);

		for(int i=0; i<e.length; i++)
		{
			if(largest==e[i].salary)
			{
				System.out.println(e[i].name);
				System.out.println(e[i].eid);
				System.out.println(e[i].salary);
			}
		}
	}

}

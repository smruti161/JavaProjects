package homeWork;

public class SecondLargest {
	public static void main(String[] args) {
		Employee e1=new Employee("Smruti",104,30000.00);
		Employee e2=new Employee("Biswajit",108,40000.0);
		Employee e3=new Employee("Ajit",104,35000.0);
		Employee [] e= {e1,e2,e3};
        double fl=Double.MIN_VALUE;
        double sl=Double.MIN_VALUE;
        for(int i=0; i<e.length; i++)
        {
        	if(e[i].salary>fl)
        	{
        		sl=fl;
        		fl=e[i].salary;
        	}
        	else if(e[i].salary>sl && e[i].salary!=fl)
        	{
        		sl=e[i].salary;
        	}
        		
        }
        System.out.println(sl);

		for(int i=0; i<e.length; i++)
		{
			if(fl==e[i].salary)
			{
				System.out.println(e[i].name);
				System.out.println(e[i].eid);
				System.out.println(e[i].salary);
			}
		}
	}

}

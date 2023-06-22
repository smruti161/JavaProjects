package array.com;

public class Driver1 {
	public static void main(String[] args) {
		Employee e1=new Employee("smruti",102,40000.0);
		Employee e2=new Employee("ajit",105,50000.0);
		Employee e3=new Employee("biswajit",101,70000.0);
		
		Employee [] arr= {e1,e2,e3};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].name);
		}
		


	}

}

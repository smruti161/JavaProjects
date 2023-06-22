package homeWork;

public class P3 {
	public static void main(String[] args) {
		int [] a1= {1,2,4,5,6};
		int [] a2= {7,8,9,6,1};
		int [] a3=new int [a1.length+a2.length];
		for(int i=0; i<a3.length; i++)
		{
			if(i<a1.length)
			{
				a3[i]=a1[i];
			}
			else
			{
				a3[i]=a2[i-a1.length];
			}
		}
		for(int a:a3)
		{
			System.out.println(a);
		}
	}
}

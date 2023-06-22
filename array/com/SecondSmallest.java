package array.com;

import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int fm=Integer.MAX_VALUE;
		int sm=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			int num=a[i];
			if(num<fm)
			{
				sm=fm;
				fm=num;
			}
			else if(num<sm && num!=fm)
			{
				sm=num;
			}
		}
		System.out.println(sm);

}
}

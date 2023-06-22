package array.com;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			int num=a[i];
			if(num>fl)
			{
				sl=fl;
				fl=num;
				
			}
			else if(num>sl && num!=fl)
			{
				sl=num;
			}
		}
		System.out.println(sl);
	}

}

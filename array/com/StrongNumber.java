package array.com;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int [] arr=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			int n1=n;
			int ld;
			int sum=0;
			int fact;
			while(n>0)
			{
				ld=n%10;
				fact=factorial(ld);
				sum=sum+fact;
				n=n/10;
			}
			if(sum==n1)
			{
				System.out.println(n1+" is a Strong Number");
			}
			else
			{
				System.out.println(n1+" is not a Strong number");
			}
			
		}
	}
	public static int factorial(int a)
	{
		int fact = 1;
		for(int j=1; j<=a; j++)
		{
			fact=fact*j;
		}
		return fact;
	}
}

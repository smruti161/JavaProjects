package array.com;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		int [] arr=new int [size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			int count=0;
			for(int j=1; j<=n; j++)
			{
				if(n%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(n+" is a prime number");
			}
			else
				System.out.println(n+" is not a prime no");
		}
	}
	
	
}

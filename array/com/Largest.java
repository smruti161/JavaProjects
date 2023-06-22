package array.com;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			int num=a[i];
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println(max);
	}

}

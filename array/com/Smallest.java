package array.com;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			int num=a[i];
			if(num<min)
			{
				min=num;
			}
		}
		System.out.println(min);
	}

}

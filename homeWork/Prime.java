package homeWork;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		int maxPrime = 0;
		while(a<=b)
		{
			int count=0;
			for(int i=1; i<=a ; i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				maxPrime = a;
				//System.out.println(a);
			}
			a++;
		}
		System.out.println("MaxPrime =" + maxPrime);
	} 
}

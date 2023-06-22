package inheritance;

import java.util.Scanner;

public class Rectangle implements Shape {
	
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length :");
		int l=sc.nextInt();
		System.out.println("Enter the width :");
		int w=sc.nextInt();
		int area=l*w;
		System.out.println("The area of Rectangle is "+area);
	}
}

package inheritance;

import java.util.Scanner;

public class Square implements Shape {
	
	public void area()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the side :");
		int s=sc.nextInt();
		int area=s*s;
		System.out.println("The are of square is "+area);
	}

}

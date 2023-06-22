package exception;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		System.out.println("main() started");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value of a ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b ");
		int b=sc.nextInt();
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
		
		System.out.println("main() ended");
	}
}

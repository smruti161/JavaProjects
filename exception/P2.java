package exception;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		System.out.println("main() started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter true or false ");
		boolean choice=sc.nextBoolean();
		try
		{
			if(choice)
			{
				System.out.println("Enter the value of a");
				int a=sc.nextInt();
				System.out.println("Enter the value of b");
				int b=sc.nextInt();
				System.out.println(a/b);

			}
			else {
				int [] arr= {5,8,9,6};
				int index=sc.nextInt();
				System.out.println(arr[index]);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't devide a number by zero");
			System.out.println("ArithmeticException is handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index is invalid");
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
		System.out.println("main() ended");
	}

}

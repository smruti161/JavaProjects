package exception;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		System.out.println("main() started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of index ");
		int [] arr= {5,8,9,6};
		int index=sc.nextInt();
		try
		{
			System.out.println(arr[index]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Index is invalid");
			System.out.println("ArrayIndexOutOfBoundsException is handled");
		}
		finally
		{
			System.out.println("Finally block is exicuted");
		}
		System.out.println("main() ended");
	}
}
package array.com;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=sc.nextInt();
		int [] arr=new int [size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			
		}
		System.out.println(largest+" is largest number");
	}
}

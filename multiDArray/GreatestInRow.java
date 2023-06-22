package multiDArray;

import java.util.Scanner;

public class GreatestInRow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter col");
		int col=sc.nextInt();
		int [][] arr=new int [row][col];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0 ; j<arr[i].length; j++)
			{
				int n=arr[i][j];
				if(n>max)
				{
					max=n;
				}
			}
			System.out.println(max);
		}
	}
}

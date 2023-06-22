package multiDArray;

import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [] [] arr1=new int [row][col];
		int [] [] arr2=new int [row][col];
		int [] [] arr3=new int [row][col];
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
	
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length;j++)
			{
				System.out.print( arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}

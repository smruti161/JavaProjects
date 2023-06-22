package pattern;

import java.util.Scanner;

public class Pyramid {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value :");
			int n=sc.nextInt();
			int space=n-1;
			int star=1;
			for(int i=1; i<=n; i++)
			{
				for(int k=1; k<=space; k++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=star; j++)
				{
					System.out.print("*");
				}
				
				System.out.println();
				space--;
				star=star+2;
			}
			
		}
}

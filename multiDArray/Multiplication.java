package multiDArray;

public class Multiplication {
	public static void main(String[] args) {
		int [] [] a1= {{1,2,3,4},{5,6,7,8}};
		int [][] a2= {{4,2},{1,2},{3,4},{5,3}};
		int [] [] a3= new int [a1.length][a2[0].length];
		for(int i=0; i<a3.length; i++)
		{
			for(int j=0; j<a3[i].length; j++)
			{
				for(int k=0; k<a2.length; k++)
				{
					a3[i][j]+=a1[i][k]*a2[k][j];
				}
			}
		}
		for(int i=0; i<a3.length; i++)
		{
			for(int j=0; j<a3[i].length; j++)
			{
				System.out.print(a3[i][j]+" ");
			}
			System.out.println();
		}
	}
}

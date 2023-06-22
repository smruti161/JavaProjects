package multiDArray;

public class PrimeNumber {
	public static void main(String[] args) {
		int [] [] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				int n=arr[i][j];
				int count=0;
				for(int a=1; a<=n; a++)
				{
					if(n%a==0)
					  count++;
				}
				if(count==2)
					System.out.println(n);
			}
		}
	}
}

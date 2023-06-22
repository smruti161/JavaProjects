package pattern;

public class HallowInvertRAT {
	public static void main(String[] args) {
		int n=4;
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=1; j--)
			{
				if(j==n||i==j||i==1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

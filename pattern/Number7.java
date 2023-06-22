package pattern;

public class Number7 {
	public static void main(String[] args) {
		int n=4;
		int space=n-1,star=1;
		for(int i=1; i<=n; i++)
		{
			int a=1;
			for(int j=1; j<=space; j++ )
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				if(k<i)
				{
					System.out.print(a++);
				}
				else
					System.out.print(a--);
			}
			System.out.println();
			space--;
			star+=2;
		}
	}
}

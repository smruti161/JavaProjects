package pattern;

public class Alphabet3 {
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for(int i=1; i<=n; i++)
		{
			int b=a+n-i;
			for(int j=1; j<=n; j++)
			{
				if(i<=j)
				{
					if(i%2==1)
					{
						System.out.print(a++ +" ");
					}
					else {
						a++;
						System.out.print(b-- +" ");
						
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

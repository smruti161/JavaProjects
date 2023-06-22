package pattern;

public class Alphabet5 {
	public static void main(String[] args) {
		int n=5;
		int a=1;
		for(int i=1; i<=n; i++)
		{
			char ch='A';
			for(int j=1; j<=n; j++)
			{
				if(i>=j)
				{
					if(i%2!=0)
					{
						System.out.print(a++);
					}
					else
					{
					System.out.print(ch++);
					a++;
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

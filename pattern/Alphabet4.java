package pattern;

public class Alphabet4 {
   public static void main(String[] args) {
	int n=4;
	for(int i=1; i<=n; i++)
	{
		char ch='A';
		for(int j=1; j<=n; j++)
		{
			if(i>=j)
			{
				if(i==j)
				{
					System.out.print(ch++);
				}
				else
				{
					ch++;
					System.out.print(j);
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

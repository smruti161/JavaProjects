package pattern;

public class Alphabet1 {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
			  if(i>=j)
			  {
				  System.out.print(ch++);
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

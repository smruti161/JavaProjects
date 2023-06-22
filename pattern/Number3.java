package pattern;

public class Number3 {
		public static void main(String[] args) {
			int n=4;
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=n; j++)
				{
					if(i>=j)
					{
					if(i%2!=0)
					{
						System.out.print(j);
					}
					else
					{
						System.out.print(i);
					}
					}
					else
					{
						System.out.print("   ");
					}
				}
				System.out.println();
			}
		}
}

package pattern;

public class Number6 {
      public static void main(String[] args) {
			int n=3;
			int space=n-1,star=1;
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=space; j++)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=star; k++)
				{
					if(k%2!=0)
					{
						System.out.print(1);
					}
					else
					{
						System.out.print(0);
					}
				}
				System.out.println();
				space--;
				star+=2;
			}
		}
}

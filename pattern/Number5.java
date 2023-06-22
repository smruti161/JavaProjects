package pattern;

public class Number5 {
		public static void main(String[] args) {
			int n=4;
			int space=n-1;
			int star=1;
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=space; j++)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=star; k++)
				{
					System.out.print(k);
				}
				System.out.println();
				space--;
				star+=2;
			}
				
		}
}

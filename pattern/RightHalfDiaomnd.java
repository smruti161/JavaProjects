package pattern;

public class RightHalfDiaomnd {
	public static void main(String[] args) {
		int n=5,mid=(n+1)/2,star=1;
		for(int i=1;  i<=n; i++)
		{
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
	}

}

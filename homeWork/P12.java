package homeWork;

public class P12 {
	public static void main(String[] args) {
		int nth=6;
		int ncount=0;
		for(int i=1; true ; i++)
		{
			int n=i;
			int count=0;
			for(int j=1; j<=n; j++)
			{
				if(n%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				ncount++;
				if(ncount==nth)
				{
					System.out.println(n);
					break;
				}
			}
		}
	}
}

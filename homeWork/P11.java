package homeWork;

public class P11 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		for(int i=a; i<=b; i++)
		{
			int num=i;
			int count=0;
			for(int j=1; j<=num; j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(num);
			}
		}
	}
}

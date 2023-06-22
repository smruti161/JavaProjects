package array.com;

public class PalindromeNumber {
	public static void main(String[] args) {
		int [] a= {12,121,323,356};
		for(int i=0; i<a.length; i++)
		{
			int n=a[i];
			int rev=0;
			int n1=n;
			int ld;
			while(n>0)
			{
				ld=n%10;
				rev=rev*10+ld;
				n=n/10;
			}
			if(rev==n1)
			{
				System.out.println(n1);
			}
		}
	}

}

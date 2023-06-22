package homeWork;

public class P10 {
	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		int ld;
		while(n>0)
		{
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		System.out.println(rev);
		
	}
}

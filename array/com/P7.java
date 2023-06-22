package array.com;

public class P7 {
	public static void main(String[] args) {
		int a=20;
		int b=50;
		int temp=a;
		a=b;
		b=temp;
		//System.out.println(a);
		//System.out.println(b);
		
		//without using temp variable
		
		int c=50;
		int d=20;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);
	}
}

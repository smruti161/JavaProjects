package homeWork;

public class P18 {
	public static void main(String[] args) {
		int [] a= {12,47,85,20};
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			int n=a[i];
			if(n>fl)
			{
				sl=fl;
				fl=n;
			}
			else if(n>sl && n!=fl)
			{
				sl=n;
			}
		}
		System.out.println(fl);
		System.out.println(sl);
	}
}

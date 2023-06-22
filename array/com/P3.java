package array.com;

public class P3 {
	public static void main(String[] args) {
		int [] arr= {12,35,64,82};
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
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
		System.out.println(sl);
	}
}

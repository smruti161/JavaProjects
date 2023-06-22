package array.com;

public class P6 {
	public static void main(String[] args) {
		int []  arr= {10,20,30,40};
		int fs=Integer.MAX_VALUE;
		int ss=Integer.MAX_VALUE;
		for(int i=0; i<arr.length;i++)
		{
			int n=arr[i];
			if(n<fs)
			{
				ss=fs;
				fs=n;
			}
			else if(n<ss && ss!=fs)
			{
				ss=n;
			}
		}
		System.out.println(ss);
	}
}

package array.com;

public class Reverse {
	public static void main(String[] args) {
		int [] a= {12,32,55,78};
		int start=0,end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		for(int obj:a)
		{
			System.out.println(obj);
		}
	}
}

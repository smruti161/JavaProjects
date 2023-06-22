package homeWork;

public class P20 {
	public static void main(String[] args) {
		int [] a= {10,24,12,75};
		int start=0; 
		int end=a.length-1;
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
			System.out.print(obj+" ");
		}
	}
}

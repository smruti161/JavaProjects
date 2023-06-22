package array.com;

public class P8 {
	public static void main(String[] args) {
		int [] arr= {12,34,98,76,5};
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}

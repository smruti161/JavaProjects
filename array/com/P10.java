package array.com;

public class P10 {
	public static void main(String[] args) {
		int []  arr= {10,20,30,65,40};
		int [] temp=new int[arr.length-1];
		int ind=2;
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i!=ind)
			{
				temp[index++]=arr[i];
			}
		}
		arr=temp;
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}

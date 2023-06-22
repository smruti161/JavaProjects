package array.com;

public class P9 {
	public static void main(String[] args) {
		int [] arr= {10,20,30,40};
		int [] temp=new int[arr.length+1];
		int ind=2;
		int data=25;
		int index=0;
		for(int i=0; i<temp.length; i++)
		{
			if(i==ind)
			{
				temp[i]=data;
			}
			else
			{
				temp[i]=arr[index++];
			}
		}
		arr=temp;
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}
}

package array.com;

public class RemovingData {
	public static void main(String[] args) {
		int [] arr= {17,81,90,5};
		int [] temp=new int [arr.length-1];
		int ind=1;
		int index=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i==ind)
			{
				temp[i]=arr[++index];
				index++;
				
			}
			else
			{
				temp[i]=arr[index++];
			}
		}
		arr=temp;
		for(int a: arr)
		{
			System.out.println(a);
		}
	}

}

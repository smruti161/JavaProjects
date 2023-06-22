package array.com;

public class InsertingData {
	public static void main(String[] args) {
		int [] arr= {12,41,56,78};
		int [] temp=new int[arr.length+1];
		int ind=2,data=30;
		int index=0;
		for(int i=0; i<temp.length; i++)
		{
			if(i==ind)
			{
				temp[i]=data;
			}
			else {
				temp[i]=arr[index++];
			}
		}
		arr=temp;
		for(int obj:arr)
		{
			System.out.println(obj);
		}
	}
}

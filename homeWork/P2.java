package homeWork;

public class P2 {
	public static void main(String[] args) {
		int [] arr= {12,25,78,64,31};
		int n=arr.length-1;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
}

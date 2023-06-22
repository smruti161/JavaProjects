package array.com;

public class P11 {
	public static void main(String[] args) {
		int [] arr= {10,20,30,30,42,85};
		int k=30;
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			if(k==n)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println(k+" is present");
		}
		else
		{
			System.out.println(k+" is not present");
		}
	}
}

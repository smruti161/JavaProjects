package array.com;

public class SearchElement {
	public static void main(String[] args) {
		int [] arr= {7,15,89,65};
		int k=15;
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			if(n==k)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}

package array.com;

public class P5 {
	public static void main(String[] args) {
		int [] arr= {12,45,78,40,32};
		int count=0;
		
		for(int i=0; true; i++)
		{
			try 
			{
			int n=arr[i];
			count++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				break;
			}
		}
		System.out.println(count);
	}
}

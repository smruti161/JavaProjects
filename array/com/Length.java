package array.com;

public class Length {
	public static void main(String[] args) {
		int [] a= {4,5,6,7,8};
		int count=0;
		//using for each loop
//		for(int obj:a)
//		{
//			count++;
//		}
//		System.out.println(count);
//		
		//using exception
		
		for(int i=0; true; i++)
		{
			try
			{
				int n=a[i]; 
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

package homeWork;

public class P19 {
	public static void main(String[] args) {
		int [] a= {12,45,74,30};
		int count=0;
		for(int i=0; true; i++)
		{
			try {
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

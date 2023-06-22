package array.com;

public class P12 {
	public static void main(String[] args) {
		int [] arr= {1,3,4,2,1,3,6,9,1,2};
		boolean [] b=new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			if(b[i]==false)
			{
				int n=arr[i];
				int count=0;
				for(int j=0; j<arr.length; j++)
				{
					if(n==arr[j])
					{
						count++;
						b[j]=true;
					}
				}
				System.out.println(n+" is occured "+count+" times");
			}
			
		}
		
	}
}
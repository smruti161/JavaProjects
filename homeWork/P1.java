package homeWork;

public class P1 {
	public static void main(String[] args) {
		int [] arr= {6,7,1,5,3,7,4,1,2,2,1};
		boolean [] b=new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			if(b[i]==false)
			{
				int count=0;
				for(int j=0; j<arr.length; j++)
				{
					if(n==arr[j])
					{
						count++;
						b[j]=true;
					}
				}
		  	System.out.println(n+" is occured for "+count+" times");

			}
		}
	}
}

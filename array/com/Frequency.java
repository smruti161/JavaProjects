package array.com;

public class Frequency {
	public static void main(String[] args) {
		int [] arr= {1,4,3,5,2,4,1,5,1};
		boolean [] b=new boolean [arr.length];
		for(int j=0;j<arr.length; j++)
		{
			int n=arr[j];
			if(b[j]==false)
			{
				int count=0;
				for(int i=0;i<arr.length;i++ )
				{
					if(arr[i]==n)
					{
						count++;
						b[i]=true;
					}
				}
				System.err.println(n+" is occured for "+count+" times");

			}
		}
		
	}

}

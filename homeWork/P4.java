package homeWork;

public class P4 {
	public static void main(String[] args) {
		  int [] arr= {1,4,8,1,2,2};
		  boolean [] b=new boolean[arr.length];
		  for(int i=0; i<arr.length; i++)
		  {
			  int n=arr[i];
			  for(int j=i+1; j<arr.length; j++)
			  {
				  if(n==arr[j])
				  {
					  b[j]=true;
				  }
			  }
		  }
		  for(int i=0; i<arr.length;i++)
		  {
			  if(b[i]!=true)
			  {
				  System.out.println(arr[i]);
			  }
		  }
	}
}

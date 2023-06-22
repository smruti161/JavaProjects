package homeWork;

public class P7 {
	public static void main(String[] args) {
		String s="Apple";
		String con="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
		    if(con.indexOf(ch)==-1)
			{
			 int count=0;
			 for(int j=0; j<s.length();j++)
			 {
			 	if(ch==s.charAt(j))
			    	{
				    	count++;
				     }
			 }
			 con=con+ch;
		}
		}
		System.out.println(con);
	}
}

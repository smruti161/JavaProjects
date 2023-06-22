package string;

public class Frequency {
	public static void main(String[] args) {
		String s="entertain";
		String con="";
		for(int i=0;i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(con.indexOf(ch)==-1)
			{
				int count=0;
				for(int j=0; j<s.length(); j++)
				{
					if(ch==s.charAt(j))
					{
						count++;
					}
				}
				System.out.println(ch+" is counted for "+count+" times");
				con=con+ch;
			}
		}
	}
}

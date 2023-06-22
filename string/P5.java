package string;

public class P5 {
	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		boolean res=isAnagram(s1,s2);
		if(res)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
	public static boolean isAnagram(String s1,String s2)
	{
		int [] count1=occurance(s1);
		int [] count2=occurance(s2);
		for(int i=0; i<count1.length; i++)
		{
			if(count1[i]==count2[i])
				return true;
		}
		return false;
		
	}
	public static int [] occurance(String s)
	{
		int [] count=new int[26];
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				count[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				count[ch-97]++;
			}
		}
		return count;
	}
}

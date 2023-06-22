package string;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s1="Apple";
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			int count=0;
			for(int j=0; j<s1.length(); j++)
			{
				if(ch==s1.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
				s1=s1.replace(ch, '$');
		}
		System.out.println(s1);
	}
}

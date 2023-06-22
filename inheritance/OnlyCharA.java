package inheritance;

public class OnlyCharA {
	public static void main(String[] args) {
		String [] s= {"smruti","ranjan","maharana"};
		for(int i=0; i<s.length; i++)
		{
			if(s[i].indexOf('a')!=-1 || s[i].indexOf('A')!=-1)
			{
				System.out.println(s[i]);
			}
		}
	}
}

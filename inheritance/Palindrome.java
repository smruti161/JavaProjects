package inheritance;

public class Palindrome {
	
	public static void main(String[] args) {
		String s1="malayalam";
		String rev=" ";
		for(int i=0; i<s1.length(); i++)
		{
			rev=s1.charAt(i)+rev;
		}
		rev=rev.trim();
		if(rev.equals(s1))
		{
			System.out.println("it is palindrome");
		}
		else
			System.out.println("not palindrome");
	}

}

package string;

public class P1 {
	public static void main(String[] args) {
		String s1="malayalam";
		String s2=" ";
		for(int i=0; i<s1.length(); i++)
		{
			s2=s2+s1.charAt(i);
		}
		s2=s2.trim();
		if(s1.equals(s2))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}

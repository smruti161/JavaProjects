package string;

public class Program2 {
	public static void main(String[] args) {
		String s1="ava";
		String rev=" ";
		for(int i=0; i<s1.length(); i++)
		{
			rev=s1.charAt(i)+rev;
		}
		rev=rev.trim();
		if(rev.equals(s1))
		{
			System.out.println("it's palindrome");
		}
		else
			System.out.println("not palindrome");
		
		//concat method
		String s2="idli";
		s2=s2.concat(" wada");
		System.out.println(s2);
	}

}

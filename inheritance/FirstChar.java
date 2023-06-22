package inheritance;

public class FirstChar {
	public static void main(String[] args) {
		String s1="Hi how are you";
		String [] s2=s1.split(" ");
		for(int i=0; i<s2.length;i++)
		{
		  char ch=s2[i].charAt(0);
		  System.out.println(ch);
		}
	}

}

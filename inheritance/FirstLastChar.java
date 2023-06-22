package inheritance;

public class FirstLastChar {
		public static void main(String[] args) {
			String [] s= {"smruti","ranjan","maharana"};
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i].charAt(0));
				System.out.println(s[i].charAt(s[i].length()-1));
				System.out.println("===================");

			}
		}
}

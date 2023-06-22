package inheritance;

public class Reverse {
		public static void main(String[] args) {
			String s1="Hi how are you";
			String s2=" ";
			for(int i=0; i<s1.length();i++)
			{
				s2=s1.charAt(i)+s2;
			}
			s2=s2.trim();
			System.out.println(s2);
		}
}

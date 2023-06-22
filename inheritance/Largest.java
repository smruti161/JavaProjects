package inheritance;

public class Largest {
		public static void main(String[] args) {
			String s1="welcome to java";
			String [] s2=s1.split(" ");
			String largest=" ";
			for(int i=0; i<s2.length; i++)
			{
				if(s2[i].length()>largest.length())
				{
					largest=s2[i];
				}
			}
			System.out.println(largest);
		}
}

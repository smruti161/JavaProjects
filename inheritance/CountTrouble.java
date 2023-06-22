package inheritance;

public class CountTrouble {
		public static void main(String[] args) {
			String s1="Don't trouble the trouble if you trouble the trouble trouble troubles you I'm not the trouble i'm the truth";
			String [] s2=s1.split(" ");
			int count=0;
			for(int i=0; i<s2.length; i++)
			{
				if(s2[i].equals("troubles"))
				{
					count++;
				}
			}
			System.out.println(count);
		}
}

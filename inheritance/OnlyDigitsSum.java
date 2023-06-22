package inheritance;

public class OnlyDigitsSum {
	public static void main(String[] args) {
		String s1="Ab5gh73";
		int sum=0;
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				System.out.println(s1.charAt(i));
				sum=sum+s1.charAt(i);
			}
		}
		System.out.println(sum);
	}
}

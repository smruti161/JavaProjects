package string;

public class P3 {
	public static void main(String[] args) {
		String s1="SH37ef2";
		int sum=0;
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		System.out.println(sum);
	}
}

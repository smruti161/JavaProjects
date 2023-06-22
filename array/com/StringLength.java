package array.com;

public class StringLength {
	public static void main(String[] args) {
		String s1="java";
		char [] ch=s1.toCharArray();
		int count=0;
		for(char a:ch)
		{
			count++;
		}
		System.out.println(count);
	}

}

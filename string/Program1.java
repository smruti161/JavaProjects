package string;

public class Program1 {
	public static void main(String[] args) {
		String s1="smruti";
		String s2="smruti";
		System.out.println(s1.length());
		for(int i=0; i<s1.length(); i++)
		{
			char ch=s1.charAt(i);
			System.out.println(ch);
		}
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		int a=10;
		String s3=String.valueOf(a);
		System.out.println(s3+20);
		char [] ch= {'a','b','c'};
		String s4=String.valueOf(ch);
		System.out.println(s4);
		String s5=new String(ch);
		System.out.println(s5);
		String s6="java";
		char [] ch1=s6.toCharArray();
		for(int i=0; i<ch1.length; i++)
		{
			System.out.println(ch1[i]);
		}
		System.out.println(s1.indexOf('r',3));
		System.out.println(s2.indexOf("ru"));
		System.out.println(s1.substring(0,4));
	}

}

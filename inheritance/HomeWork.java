package inheritance;

public class HomeWork {
	  public static void main(String[] args) {
		String s="Tir";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		if(count>=1)
		{
			System.out.println("a is present");
		}
		else
		{
			System.out.println("a is not present");
		}
	}

}


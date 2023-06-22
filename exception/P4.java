package exception;

public class P4 {
	public static void test()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
	   System.out.println("main() strted");
	   
	   try{
		   test();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   System.out.println("Exception is handled");
		   
	   }
	   System.out.println("main() ended");
	}

}

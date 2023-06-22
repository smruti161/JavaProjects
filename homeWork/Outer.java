package homeWork;

// class Outer {
//	 static class Inner{
//		 public static void test()
//		 {
//			 System.out.println("HII");
//		 }
//	 }
//	 public static void main(String[] args) {
//		Inner.test();
//	}
//}
//class Outer
//{
//	static class Inner
//	{
//		public void test()
//		{
//			System.out.println("Heloo");
//		}
//	}
//	
//	public static void main(String[] args) {
//		Outer.Inner obj=new Outer.Inner();
//		obj.test();
//	}
//}

class Outer {
	class Inner{
		public void test() {
			System.out.println("hello world");
		}
	}
	public static void main(String[] args) {
		Inner o1 = new Outer().new Inner();
		o1.test();
		
	}
}

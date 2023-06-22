package inheritance;

public class B {
		
	public static void main(String[] args) {
		B obj1=new B();
		B obj2=new B();
		System.out.println(obj1.equals(obj2));
		
		B obj3=new B();
		B obj4=obj3;
		
		System.out.println(obj3.equals(obj4));
	}
}

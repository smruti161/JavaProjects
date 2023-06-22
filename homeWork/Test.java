package homeWork;

public class Test {
	public static void main(String[] args) {
		Home h1 = new Home() { //Annonymous class//We can create object of interface
			public void test() {
				System.out.println("hello world");
			}
		};
		h1.test();
	}

}

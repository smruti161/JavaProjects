package map;

import java.util.HashMap;

public class P2 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<>();
		h1.put(5, "hello");
		h1.put(4, "hii");
		h1.put(10,"bye");
		h1.put(2, "tata");
		System.out.println(h1.containsKey(4));
		System.out.println(h1.containsValue("bye"));
		System.out.println(h1.get(2));
		h1.remove(4);
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
	}
}

package map;

import java.util.HashMap;

public class P1 {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1, 10);
		h1.put(7, "hello");
		h1.put(10, 20);
		h1.put("gg", 'q');
		System.out.println(h1.size());
		System.out.println(h1);
		h1.put(2, "smruti");
		System.out.println(h1);
		h1.put(2, 'f');
		System.out.println(h1.size());
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
	}
}

package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P3 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<>();
		h1.put(5, "hello");
		h1.put(4, "hii");
		h1.put(10,"bye");
		h1.put(2, "tata");
		Set s=h1.keySet();
//		for(Object obj:s)
//		{
//			System.out.println(obj);
//		}
//		Collection c=h1.values();
//		for(Object obj:c)
//		{
//			System.out.println(obj);
//		}
		for(Map.Entry<Integer, String> i: h1.entrySet())
		{
			System.out.println("keys :"+i.getKey()+" value :"+i.getValue());
		}
	}
}
















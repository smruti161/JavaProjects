package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class P7 {
	public static void main(String[] args) {
		LinkedHashMap <Integer,String>l1=new LinkedHashMap<>();
		l1.put(5, "hello");
		l1.put(4, "hii");
		l1.put(10,"bye");
		l1.put(1,"bb");
		System.out.println(l1);
		
		for(Map.Entry<Integer, String > i: l1.entrySet())
		{
			System.out.println("key :"+i.getKey()+" value "+i.getValue());
		}
	}
}

package string;

import java.util.Arrays;

public class ReverseOfWords {
	public static void main(String[] args) {
		String s1=" this is boy "; // boy is this
		s1=s1.trim();
		String[] words = s1.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(int i=0;i<words.length/2;i++) {
			String temp = words[i];
			words[i] = words[words.length-1];
			words[words.length-1] = temp;
			
		}
		System.out.println(Arrays.toString(words));
		String rev = String.join(" ", words);
		System.out.println(rev);
	}
}

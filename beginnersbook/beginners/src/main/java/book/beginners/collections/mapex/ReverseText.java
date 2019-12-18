package book.beginners.collections.mapex;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseText {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		String text = "My Name Is Reddy";
		String[] words = text.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			ls.add(words[i]);
			System.out.print(words[i] +" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		Collections.sort(ls);
		for(String str : ls) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("==========================");
	}

}

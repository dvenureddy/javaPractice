package book.beginners.collections.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		hMap.put(d1, 10);
		hMap.put(d2, 15);
		hMap.put(d3, 5);
		hMap.put(d4, 20);
       //print size
		System.out.println(hMap.size());
       //loop HashMap
		Set<Entry> entries = hMap.entrySet();
		for (Iterator<Entry> text = entries.iterator(); text.hasNext();) {
			Entry e = (Entry) text.next();
			System.out.println(e.getKey().toString() + " - " + e.getValue());
		}
	}
}

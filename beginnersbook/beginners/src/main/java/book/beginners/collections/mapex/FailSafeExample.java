package book.beginners.collections.mapex;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		// Creating a ConcurrentHashMap
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();

		chm.put("ONE", 1);
		chm.put("TWO", 2);
		chm.put("THREE", 3);
		chm.put("FOUR", 4);

		// Getting an Iterator from map
		Iterator<String> it = chm.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + chm.get(key));

			// This will reflect in iterator.
			// Hence, it has not created separate copy
			chm.put("SEVEN", 7);
		}

	}

}

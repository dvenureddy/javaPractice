package book.beginners.collections.mapex;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();
		
		// Adding elements to the Map
		chm.put("ONE", 1);
		chm.put("TWO", 2);
		chm.put("THREE", 3);
		chm.put("FOUR" , 4);
		
		// Getting an Iterator from map
		
		Iterator<String> it = chm.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();            
            System.out.println(key + " : " + chm.get(key));
             
            chm.put("SIX", 6);     //This will not be reflected in the Iterator
		}
	}

}

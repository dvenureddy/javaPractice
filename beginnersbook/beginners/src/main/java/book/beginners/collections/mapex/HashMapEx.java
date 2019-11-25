package book.beginners.collections.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Hash map implements Map interface.
 * HashMap implementation LinkedHashMap maintains the insertion order and TreeMap
 * sorts the mappings based on the ascending order of keys.
 * Add Elements using put.
 * Remove Elements using Key. 
 * Remove Elements using Key and Value. 
 * Insertion Order is not maintained. 
 * Elements are not sorted.
 * NUll Keys are allowed but it replace with new value. 
 * Null Values are allowed 
 * Hash Map is unSynchronized
 * It permits Null Values and Null Key.
 * Iterate through multiple ways
 * 
 * @author vendolla
 *
 */
public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(10, "Peter");
		hmap.put(1, "David");
		hmap.put(2, "Steve");
		hmap.put(3, "Alex");
		hmap.put(null, "Thomas");
		hmap.put(3, "Bob");
		hmap.put(4, "John");
		hmap.put(5, "Tim");
		hmap.put(7, "Justin");
		hmap.put(110, "Potter");
		hmap.put(9, " ");
		hmap.put(8, "Alex");
		hmap.put(6, null);
		hmap.put(null, "Lucy");
		hmap.put(100, "Harry");
		hmap.put(120, null);
		hmap.put(105, null);

		System.out.println("Employees List : " + hmap);

		hmap.remove(null);
		System.out.println("Employees List After removing Using Key : " + hmap);
		hmap.put(null, "Thomas");
		hmap.remove(null, "Thomas");
		System.out.println("Employees List after removing Using Key Value : " + hmap);

		System.out.println("---------------------------------------");
		System.out.println("Employees list using advance For loop ");
		System.out.println("---------------------------------------");
		for (Entry<Integer, String> emp : hmap.entrySet()) {
			System.out.println("Employee Id : " + emp.getKey() + " Name is : " + emp.getValue());
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		Iterator<Entry<Integer, String>> it = hmap.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> mapValues = it.next();
			System.out.println("Employee Id : " + mapValues.getKey() + " Name is : " + mapValues.getValue());
		}

		System.out.println("Contains Null Key : " + hmap.containsKey(null));
		System.out.println("Contains Null Value : " + hmap.containsValue(null));
		System.out.println("Retrieve Default Value : " + hmap.get(10000));
		System.out.println("Retrieve Default Value : " + hmap.get(100));

	}

}

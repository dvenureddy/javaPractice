package book.beginners.collections.mapex;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Tree Map is Red-Black tree based NavigableMap implementation
 * Add Elements using Put
 * Remove Elements using Key
 * Remove Elements using Key and Value
 * Insertion Order is not maintained 
 * Elements are sorted in ascending order of its keys 
 * Null Keys are not allowed
 * Duplicate Keys and Values are not permitted
 * It is Unsynchronized
 * Iterate through multiple ways
 * 
 * @author vendolla
 *
 */
public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		// Adding Elements 
		tmap.put(5,"Peter");
		tmap.put(2,"Steve");
		tmap.put(3,"Bob");
		tmap.put(6,"Alex");
		tmap.put(4,"Anjela");
		tmap.put(20, null);
		tmap.put(10, null);
		tmap.put(12, "Harry");
		// tmap.put(null, "Lucy"); //Null Key is not allowed java.lang.NullPointerException
		tmap.put(1, "Justin");
		tmap.put(11, "Lucy");
		tmap.put(20, "Potter");
		tmap.put(15, "Jim");  // Duplicate Key and Value
		tmap.put(15, "Jim"); // Duplicate Key and Value
		tmap.put(7, "David");
		System.out.println("Employees List : " + tmap);
		
		// Remove Key and Value
		//tmap.remove(null);// Null Key is not allowed java.lang.NullPointerException
		tmap.remove(20);
		tmap.remove(10, null);
		System.out.println("Employees List after removing Null key : " + tmap); 
		System.out.println("Employee List based on Get : " + tmap.get(11));
		
		
		System.out.println("-------------------------------------------");
		System.out.println("Employees displayed using advance for loop");
		System.out.println("-------------------------------------------");
		for(Entry<Integer, String> emp : tmap.entrySet()) {
			System.out.println("Employee Id : " + emp.getKey() + " Name is : " + emp.getValue());
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Employees displayed using While Iterator loop");
		System.out.println("----------------------------------------------");
		Iterator<Entry<Integer, String>> it = tmap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> tmapValues = it.next();
			System.out.println("Employee Id : " + tmapValues.getKey() + " Name is : " + tmapValues.getValue());
		}

		System.out.println("Contains Null Key : " + tmap.containsKey(11));
		System.out.println("Contains Null Value : " + tmap.containsValue(null));
		System.out.println("Retrieve Value based on key : " + tmap.get(11));
		
	}
}
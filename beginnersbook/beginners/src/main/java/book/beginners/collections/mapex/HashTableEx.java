package book.beginners.collections.mapex;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Enumeration;

/**
 * HashTable implements Map Interface
 * Add Elements using put
 * Remove Elements using Key
 * Remove Elements using Key and Value
 * Insertion Order is not maintained 
 * Elements are not sorted
 * Hash Map is synchronized 
 * It doesn't permits Null Values and Null Key
 * Iterate through multiple ways
 * @author vendolla
 *
 */
public class HashTableEx {

	public static void main(String[] args) {

		Enumeration<Integer> empNames;
		int keyValues;

		Hashtable<Integer, String> hst = new Hashtable<Integer, String>();
		hst.put(5, "Peter");
		hst.put(2, "Steve");
		hst.put(3, "Bob");
		hst.put(6, "Alex");
		hst.put(4, "Anjela");
		hst.put(12, "Harry");
		hst.put(1, "Justin");
		hst.put(11, "Lucy");
		hst.put(20, "Potter");
		hst.put(15, "Jim");
		hst.put(7, "David");
		hst.put(7, "Tom");
		//hst.put(10, null); // Null Value is not allowed
		//hst.put(null, "Lucy"); //Null Key is not allowed
		// java.lang.NullPointerException

		System.out.println("Employees List : " + hst);

		// Remove Key and Value
		// tmap.remove(null);// Null Key is not allowed java.lang.NullPointerException
		// hst.remove(10, null);
		hst.remove(20);
		
		System.out.println("Employees List after removing Null key : " + hst);
		System.out.println("Employee List based on Get : " + hst.get(11));

		System.out.println("-------------------------------------------");
		System.out.println("Employees displayed using advance for loop");
		System.out.println("-------------------------------------------");
		for (Entry<Integer, String> emp : hst.entrySet()) {
			System.out.println("Employee Id : " + emp.getKey() + " Employee Name : " + emp.getValue());
		}

		System.out.println("-------------------------------------------");
		System.out.println("Employees displayed using iterator While loop");
		System.out.println("-------------------------------------------");
		Iterator<Entry<Integer, String>> it = hst.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> hstvalues = it.next();
			System.out.println("Employee Id : " + hstvalues.getKey() + " Employee Name : " + hstvalues.getValue());
		}

		System.out.println("-------------------------------------------------");
		System.out.println("Employees displayed using Enumeration While loop");
		System.out.println("-------------------------------------------------");
		empNames = hst.keys();
		while (empNames.hasMoreElements()) {
			keyValues = (Integer) empNames.nextElement();
			System.out.println("Employee Id : " + keyValues + " Employee Name : " + hst.get(keyValues));
		}
	}

}

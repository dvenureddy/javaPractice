package book.beginners.collections.setex;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet Implements Set Interface 
 * Add Elements Using add
 * Remove Elements Using remove
 * Iterate through advance for loop, while using Iterator 
 * Duplicate Values are not allowed 
 * Null Value is allowed 
 * No insertion order is maintained
 * 
 * @author vendolla
 *
 */
public class HashSetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		// Add Elements
		hs.add("Stephen");
		hs.add("Bob");
		hs.add("Peter");
		hs.add("David");
		hs.add("Alex");
		hs.add("Tomas");
		// Duplicate Values
		hs.add("Nadia");
		hs.add("Nadia");
		// Null Values
		hs.add(null);
		hs.add("Tim");
		hs.add(null);
		System.out.println("Employees List : " + hs);
		// Remove Elements
		hs.remove(null);
		System.out.println("Employees List after removing Element :  " + hs);

		System.out.println("--------------------------------------");
		System.out.println("Employees list using advance For loop ");
		System.out.println("---------------------------------------");
		for (String emp : hs) {
			System.out.println(emp);
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------------");
		System.out.println("Employees list using Enum ");
		System.out.println("--------------------------");
		// Get the Enumeration object
		Enumeration<String> enm = Collections.enumeration(hs);
		// Enumerate through the HashSet elements
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}
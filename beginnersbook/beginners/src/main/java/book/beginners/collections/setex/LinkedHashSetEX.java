package book.beginners.collections.setex;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *  Linked HashSet implements Set Interface 
 *  Add Elements using add
 *  Remove Elements using remove
 *  Iterate through advance for loop, while using Iterator 
 *  Duplicate Values are not allowed 
 *  Null Value is allowed 
 *  Insertion order is maintained 
 * 
 * @author vendolla
 *
 */
public class LinkedHashSetEX {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		// Add Elements
		lhs.add("Thomas");
		lhs.add("Alex");
		lhs.add("Bob");
		lhs.add("Steve");
		lhs.add("Reggie");
		lhs.add(null);
		lhs.add("Tim");
		lhs.add("Peter");
		lhs.add("Tim");
		System.out.println("Employees List : " + lhs);

		// Remove Elements
		lhs.remove(null);
		System.out.println("Employees Liist : " + lhs);

		System.out.println("--------------------------------------");
		System.out.println("Employees list using advance For loop ");
		System.out.println("---------------------------------------");
		for (String emp : lhs) {
			System.out.println(emp);
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		Iterator<String> it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------------");
		System.out.println("Employees list using Enum ");
		System.out.println("--------------------------");
		// Get the Enumeration object
		Enumeration<String> enm = Collections.enumeration(lhs);
		// Enumerate through the Linked HashSet elements
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}

}

package book.beginners.collections.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Array List Concept.
 * Array List Implements List Interface.
 * Add Elements.
 * Remove Elements.
 * Set Elements or Replace Elements.
 * Iterate through the list of Elements in multiple ways.
 * Duplicate Elements are allowed.
 * Insertion order is maintained.
 * ArrayList search operation is pretty fast. 
 * 
 * @author vendolla
 *
 */
public class ArrayListExm {

	public static void main(String[] args) {

		ListIterator<String> litr = null;
		ArrayList<String> al = new ArrayList<String>();
		// Adding String Values to Array List
		al.add("John");
		al.add("Thomas");
		al.add("Peter");
		al.add("Steve");
		al.add("Tim");
		al.add("Tim");
		// Displaying the list
		System.out.println("Name of the employees : " + al);

		// Adding String at a particular position
		al.add(4, "Angela");
		System.out.println("Name of the employees after adding : " + al);

		al.add("Lucy");
		System.out.println("Name of the employees :  " + al);
		// Remove String from List based on the index
		al.remove(4);
		System.out.println("Name of the employees after removing : " + al);
		// Remove String from list based on the String value
		al.remove("John");
		System.out.println("Name of the employees after removing : " + al);

		System.out.println("------------------------------------------------------");
		// Adding elements at a particular position
		al.add(0, "Justin");
		System.out.println("Employees list using advance For loop ");
		System.out.println("-------------------------------");
		for (String emp : al) {
			System.out.println(emp);
		}

		// Set example
		al.set(2, "Harry");
		System.out.println("-------------------------------");
		System.out.println("Employees list using For loop ");
		System.out.println("-------------------------------");
		for (int count = 0; count < al.size(); count++) {
			System.out.println(al.get(count));
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using While loop ");
		System.out.println("-------------------------------");
		int alCount = 0;
		while (al.size() > alCount) {
			System.out.println(al.get(alCount));
			alCount++;
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Enum ");
		System.out.println("-------------------------------");
		// Get the Enumeration object
		Enumeration<String> enm = Collections.enumeration(al);
		// Enumerate through the ArrayList elements
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
		
		//Obtaining list iterator
		litr = al.listIterator();
		System.out.println("--------------------------------------------------------");
		System.out.println("Employees list using List Iterator in forward direction ");
		System.out.println("--------------------------------------------------------");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("--------------------------------------------------------");
		System.out.println("Employees list using List Iterator in backward direction ");
		System.out.println("--------------------------------------------------------");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}

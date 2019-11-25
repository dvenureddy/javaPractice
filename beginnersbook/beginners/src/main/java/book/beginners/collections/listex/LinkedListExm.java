package book.beginners.collections.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Linked List Concept 
 * Linked List Implements List Interface. 
 * Add Elements.
 * Remove Elements.
 * Set Elements or Replace Elements.
 * Iterate through the list of Elements in multiple ways.
 * Duplicate Elements are allowed.
 * Insertion order is maintained.
 *  
 * @author vendolla
 *
 */

public class LinkedListExm {
	public static void main(String[] args) {

		ListIterator<String> litr = null;
		LinkedList<String> ll = new LinkedList<String>();
		ArrayList<String> al = new ArrayList<String>();
		// adding elements to list
		ll.add("Steve");
		ll.add("Thomas");
		ll.add("Rick");
		System.out.println("Employees List : " + ll);
		// Add Element at first location
		ll.addFirst("Glenn");
		System.out.println("Employees List after adding at first Location : " + ll);
		// Add Element at last location
		ll.addLast("Carl");
		System.out.println("Employees List after adding at last Location : " + ll);
		// Add Element at a particular location
		ll.add(2, "Alex");
		System.out.println("Employees List after adding at particular Location : " + ll);
		ll.addLast("Carl");
		System.out.println("Employees List after adding duplicate values at last Location : " + ll);
		ll.add(0, "John");
		System.out.println("Employees List after adding at First Location based on index : " + ll);

		// Retrieve Employees based on get Method
		Object firstEmp = ll.getFirst();
		System.out.println("Employees List based on get First Method : " + firstEmp);
		System.out.println("Employees List based on get method : " + ll.get(5));

		System.out.println("Total No: of Employees before removing :  " + ll.size());
		// Remove values
		ll.remove();
		System.out.println("Employees List after removing : " + ll);
		ll.remove(4);
		System.out.println("Employees List after removing value based on index : " + ll);
		ll.removeFirst();
		System.out.println("Employees List after removing First value based on FirstMethod : " + ll);
		ll.removeLast();
		System.out.println("Employees List after removing Last value based on LastMethod : " + ll);
		System.out.println("Total No: of Employees after removing :  " + ll.size());
		System.out.println("Employess List by using peek method : " + ll.peek());
		ll.push("Tom");

		// Set example
		ll.set(2, "Harry");
		System.out.println("-------------------------------");
		System.out.println("Employees list using For loop ");
		System.out.println("-------------------------------");
		for (int count = 0; count < ll.size(); count++) {
			System.out.println(ll.get(count));
		}

		System.out.println("---------------------------------------");
		System.out.println("Employees list using advance For loop ");
		System.out.println("----------------------------------------");
		for (String emp : ll) {
			System.out.println(emp);
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using While loop ");
		System.out.println("-------------------------------");
		int llCount = 0;
		while (ll.size() > llCount) {
			System.out.println(ll.get(llCount));
			llCount++;
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		// Iterating Linked list
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Enum ");
		System.out.println("-------------------------------");
		// Get the Enumeration object
		Enumeration<String> enm = Collections.enumeration(ll);
		// Enumerate through the ArrayList elements
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}

		System.out.println("----------------------------------------");
		al.addAll(ll);
		System.out.println("Add all Employees to Array List : " + al);

		System.out.println("----------------------------------------");
		Object str = ll.clone();
		System.out.println("Employees Cloned List : " + str);

		System.out.println("Verify if employee exits : " + ll.contains("Carl"));

		// Obtaining list iterator
		litr = ll.listIterator();
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

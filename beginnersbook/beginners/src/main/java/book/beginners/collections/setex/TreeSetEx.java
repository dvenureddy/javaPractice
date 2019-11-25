package book.beginners.collections.setex;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *  TreeSet Implements Set Interface
 *  Add Elements using add method
 *  Remove Elements using remove method
 *  Duplicate Values are not allowed
 *  Null Values are not allowed 
 *  If we try to add Null values then NullPointer Exception is displayed
 *  Iterate through For loop, While Iterator, Enumeration 
 *  Insertion order is not maintained but displayed in Ascending order 
 *  
 *  @author vendolla
 *
 */
public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		// Adding
		ts.add("Tim");
		ts.add("Alex");
		ts.add("Steve");
		ts.add("Bob");
		// ts.add(null); // java.lang.NullPointerException is displayed when you add
		// Null Value
		ts.add("John");
		ts.add("Peter");
		ts.add("Lucy");
		ts.add("Alex");
		ts.add("Justin");
		ts.add("Angela");
		System.out.println("Employees List : " + ts);

		// ts.remove(null); // java.lang.NullPointerException is displayed when you try
		// to remove Null value

		ts.remove("Alex");
		System.out.println("Employees List After Removing : " + ts);

		System.out.println("-------------------------------------");
		System.out.println("Display employees using adavnce For loop");
		System.out.println("-------------------------------------");
		for (String emp : ts) {
			System.out.println(emp);
		}

		System.out.println("-------------------------------------");
		System.out.println("Display employees using while iterator");
		System.out.println("-------------------------------------");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("-------------------------------------");
		System.out.println("Display employees using Enumeration");
		System.out.println("-------------------------------------");
		Enumeration<String> enm = Collections.enumeration(ts);
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}

	}

}
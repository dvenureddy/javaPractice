package book.beginners.collections.mapex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * Linked Hash map implements Map interface.
 * Add Elements using put.
 * Remove Elements using Key. 
 * Remove Elements using Key and Value. 
 * Insertion Order is maintained. 
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
public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(5, "Peter");
		lhm.put(2, "Steve");
		lhm.put(3, "Bob");
		lhm.put(6, "Alex");
		lhm.put(4, "Anjela");
		lhm.put(12, "Harry");
		lhm.put(1, "Justin");
		lhm.put(11, "Lucy");
		lhm.put(20, "Potter");
		lhm.put(15, "Jim");
		lhm.put(7, "David");
		lhm.put(7, "Tom");
		lhm.put(10, null);
		lhm.put(null, "Tim");
		lhm.put(13, null);
		
		System.out.println("Employees Detials : " + lhm);
		
		lhm.remove(null);
		System.out.println("Employees List after removing Using Key : " + lhm);
		lhm.put(null, "Thomas");
		System.out.println("Employees List after adding null key : " + lhm);
		lhm.remove(null, "Thomas");
		System.out.println("Employees List after removing Using Key Value : " + lhm);
		
		System.out.println("-------------------------------------------");
		System.out.println("Employees displayed using advance for loop");
		System.out.println("-------------------------------------------");
		for(Entry<Integer, String> emp : lhm.entrySet()) {
			System.out.println("Employee Id : " + emp.getKey() + " Employee Name : " + emp.getValue());
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Employees displayed using iterator While loop");
		System.out.println("-------------------------------------------");
		Iterator<Entry<Integer, String>> it = lhm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> lhmValues = it.next();
			System.out.println("Employee Id : " + lhmValues.getKey() + " Employee Name : " + lhmValues.getValue() );
		}
		
	}

}

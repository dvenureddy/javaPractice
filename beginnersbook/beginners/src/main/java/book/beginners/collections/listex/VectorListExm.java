package book.beginners.collections.listex;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Vector List Concept Vector Implements List Interface 
 * Add Elements. 
 * Remove Elements.
 * Retrieve Elements based on Index.
 * Iterate through the Vector Elements in different ways.
 * Insertion order is maintained.
 * Duplicates are allowed.
 * It is synchronized - due to which it gives poor performance
 * 
 * @author vendolla
 *
 */
public class VectorListExm {

	public static void main(String[] args) {

		ListIterator<String> litr = null;
		// Default initial capacity of 10
		Vector<Integer> vec = new Vector<Integer>();
		// Add elements to Vector List
		vec.add(100);
		vec.add(200);
		vec.add(300);
		vec.add(400);
		vec.add(500);
		vec.add(600);
		vec.add(700);
		vec.add(800);
		vec.add(900);
		vec.add(1000);

		System.out.println("Vector capacity is : " + vec.capacity());
		System.out.println("Vector size is : " + vec.size());
		System.out.println("Vector Values : " + vec);

		Vector<String> vecEmp = new Vector<String>(3);

		System.out.println("Vector capacity is : " + vecEmp.capacity());
		vecEmp.add("Thomas");
		vecEmp.add("David");
		vecEmp.add("Steve");
		vecEmp.add("Alex");
		vecEmp.add("Rick");
		vecEmp.add("Reggie");
		vecEmp.add("Bob");

		System.out.println("Vector capacity is : " + vecEmp.capacity());
		System.out.println("Vector Values : " + vecEmp);

		Vector<String> vecEmpl = new Vector<String>(6, 20);
		System.out.println("Vector capacity is : " + vecEmpl.capacity());
		vecEmpl.addAll(vecEmp);
		System.out.println("Vector capacity is : " + vecEmpl.capacity());
		System.out.println("Vector values : " + vecEmpl);

		vecEmp.add(7, "Kelly");
		System.out.println("Employees Added based on index : " + vecEmp);

		vecEmp.add(7, "Abner");
		System.out.println("Employees Added based on index : " + vecEmp);

		vecEmp.add(7, "Kelly");
		System.out.println("Employees Added based on index : " + vecEmp);

		vecEmp.add("Kelly");
		System.out.println("Employees Added based on index : " + vecEmp);
		// Verify is Vector empty
		System.out.println("Verify is vector empty : " + vec.isEmpty());
		// Replce a value
		System.out.println("Replace a Employee Name at a particular location :" + vecEmp.set(10, "Henry"));
		System.out.println("Replace a Employee Name at a particular location :" + vecEmp.set(9, "Lee"));
		System.out.println(" Employees list after Replace : " + vecEmp);

		// Retrieve Employees list
		System.out.println("Retrieve First Employee using Vector : " + vecEmp.firstElement());
		System.out.println("Retrieve Last Employee using Vector : " + vecEmp.lastElement());
		System.out.println("Retrieve Employee at a particular Location : " + vecEmp.elementAt(4));
		System.out.println("Retrieve Employee at a particular Index : " + vecEmp.get(4));

		// Remove Elements
		vecEmp.remove(5);
		System.out.println("Remove Employees at a Particular Location : " + vecEmp);
		vecEmp.removeElementAt(5);
		System.out.println("Remove Employees at a Particular Index : " + vecEmp);

		System.out.println("-------------------------------");
		System.out.println("Employees list using For loop ");
		System.out.println("-------------------------------");
		for (int count = 0; count < vecEmp.size(); count++) {
			System.out.println(vecEmp.get(count));
		}

		System.out.println("--------------------------------------");
		System.out.println("Employees list using adavnce For loop ");
		System.out.println("--------------------------------------");
		for (String emp : vecEmp) {
			System.out.println(emp);
		}
		System.out.println("-------------------------------");
		System.out.println("Employees list using While loop ");
		System.out.println("-------------------------------");
		int vecCount = 0;
		while (vecCount < vecEmp.size()) {
			System.out.println(vecEmp.get(vecCount));
			vecCount++;
		}

		System.out.println("-------------------------------");
		System.out.println("Employees list using Iterator ");
		System.out.println("-------------------------------");
		Iterator<String> it = vecEmp.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------------------------");
		System.out.println("Employees list using Collections Enum ");
		System.out.println("--------------------------------------");
		Enumeration<String> enm = Collections.enumeration(vecEmp);
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());

		}

		System.out.println("----------------------------------------");
		System.out.println("Employees list using Vector Enumeration ");
		System.out.println("----------------------------------------");
		Enumeration<String> vecEnm = vecEmp.elements();
		while (vecEnm.hasMoreElements()) {
			System.out.println(vecEnm.nextElement());

		}

		// Obtaining list iterator
		litr = vecEmp.listIterator();
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

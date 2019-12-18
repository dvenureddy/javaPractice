package book.beginners.collections.listex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Array List is Fail fast
 * @author vendolla
 *
 */
public class FailFastIteratorExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Adding elements to List
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(300);
		
		// Getting an iterator from list 
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
            Integer integer = (Integer) it.next();   
            System.out.println("Array List : " + integer);
            al.add(400);      //This will throw ConcurrentModificationException
		}
		

	}

}

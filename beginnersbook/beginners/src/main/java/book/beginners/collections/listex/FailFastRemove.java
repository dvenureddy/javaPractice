package book.beginners.collections.listex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Array List is Fail fast
 * @author vendolla
 *
 */
public class FailFastRemove {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(1); 
        al.add(2); 
        al.add(3); 
        al.add(4); 
        al.add(5); 
  
        Iterator<Integer> itr = al.iterator(); 
        while (itr.hasNext()) { 
        	//System.out.println(itr.next());
        	if (itr.next() == 2) { 
                // will not throw Exception 
                itr.remove(); 
            } 
            
        } 
  
        System.out.println(al); 
  
        itr = al.iterator(); 
        while (itr.hasNext()) { 
            if (itr.next() == 3) { 
                // will throw Exception on 
                // next call of next() method 
                al.remove(3); 
            } 
        } 
	}

}

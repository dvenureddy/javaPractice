package book.beginners.collections.listex;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		ar.add(500);
		ar.add("Hello World");
		ar.add(13.46);
		ar.add('c');
		
		System.out.println("Size of the Array : " + ar.size());
		
		for(int i=0; i<ar.size();i++) {
			System.out.println("Array Value is : " + ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(4000);
		

	}

}

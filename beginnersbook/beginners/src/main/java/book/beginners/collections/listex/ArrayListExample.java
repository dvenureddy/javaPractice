package book.beginners.collections.listex;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String args[]) {
		ArrayList<String> cities = new ArrayList<String>() {
			{
				add("Delhi");
				add("Agra");
				add("Chennai");
			}
		};
		System.out.println("Content of Array list cities:" + cities);
	}

}

package basics;

public class ArrayConcept {

	public static void main(String[] args) {
		// One Dimensional Array
		// Disadvantages of Array
		/*
		 * 1. Size is fixed -- Static Array -- To Overcome this problem we use
		 * Collections -- ArrayList, HashTable -- use dynamic Array
		 *  2. Stores Similar Data type -- To Overcome this problem we use Object Array
		 */
		// Array is to store Similar Data Type Values in Array Variable
		// 1. int array:
		// Lowest bound / index = 0
		// Upper bound / index = n-1 (n is the Size of the array)

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println("i Value is : " + i[2]);
		System.out.println("i Value is : " + i[3]);

		// System.out.println("i Value is :" + i[4]); // ArrayIndexOutOfBoundsException

		System.out.println("Size of Array : " + i.length); // Size / length of array

		System.out.println("*********************************");
		// Print all the Values of Array
		for (int j = 0; j < i.length; j++) {
			System.out.println("All Integer Values : " + i[j]);
		}

		System.out.println("*********************************");
		// 2. Double Array
		double d[] = new double[5];
		d[0] = 12.33;
		d[1] = 14.89;
		d[2] = 45.98;
		for (int y = 0; y < d.length; y++) {
			System.out.println("All Double Values : " + d[y]);
		}

		System.out.println("*********************************");
		// 3. Char Array
		char c[] = new char[3];
		c[0] = 'q';
		c[1] = 65;
		c[2] = '$';
		for (int z = 0; z < c.length; z++) {
			System.out.println("All Character Values : " + c[z]);
		}

		System.out.println("*********************************");
		// 4. Boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		for (int e = 0; e < b.length; e++) {
			System.out.println("All Boolean Values : " + b[e]);
		}

		System.out.println("*********************************");
		// 5. String Array
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "Hello";
		s[2] = "World";
		for (int f = 0; f < s.length; f++) {
			System.out.println("All String Values : " + s[f]);
		}
		System.out.println("*********************************");
		
		// 6. Object Array (Object is class) Object Array is used to different data types values
		Object ob[] = new Object[6];
		
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = "M";
		ob[5] = "London";
		
		for (int y = 0; y < ob.length; y++) {
			System.out.println("All Object Values : " + ob[y]);
		}
		System.out.println("*********************************");
		
	}
}
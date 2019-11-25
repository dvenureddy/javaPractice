package basics;

public class DataTypes {

	// Hi this is my first Java Code

	/**
	 * Hi this is my first Java Code
	 */
	// main() method --> starting / execution point of the program
	public static void main(String[] args) {
		// Primitive Data types : int, double, char, boolean,
		// 1. Integer :
		int i = 10;
		System.out.println("Integer Value : " + i);
		i = 20;
		int j = 30;
		int k = 40;
		int l = -10;
		int p = 0;
		System.out.println("Integer Values : " + i + "  " + j + "  " + k + "  " + l + "  " + p);

		// 2. Double :
		double d = 12.33;
		double d1 = 34.44;
		double d2 = 100;
		System.out.println("Double : " + d + " " + d1 + " " + d2);

		// 3. Char : Only Single digit Value, should be written in Single quotes
		char c = 'a';
		char c1 = 'A';
		char c2 = '1';
		char c3 = '$';
		System.out.println("Char : " + c + "  " + c1 + " " + c2 + " " + c3);

		// 4. Boolean :
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("Boolean : " + b1 + " " + b2);

		// 5. String is a class not a data type
		String s = " Selenium ";
		String s1 = "Hello World";
		String s2 = "1000";
		String s3 = "12.33";
		System.out.println("String : " + s + " " + s1 + " " + s2 + "  " + s3);
	}

}
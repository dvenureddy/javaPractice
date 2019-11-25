package basics;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		String x[][] = new String[3][5];

		System.out.println("Total Number of Rows :" + x.length);
		System.out.println("Total Number of Columns :" + x[0].length);
		System.out.println("---------------------------");
		
		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		x[0][3] = "d";
		x[0][4] = "e";
		
		x[1][0] = "A";
		x[1][1] = "B";
		x[1][2] = "C";
		x[1][3] = "D";
		x[1][4] = "E";
		
		x[2][0] = "a";
		x[2][1] = "b";
		x[2][2] = "c";
		x[2][3] = "d";
		x[2][4] = "e";

		for(int row = 0; row < x.length; row++) {
			for(int col=0;col<x[row].length;col++) {
				System.out.println("Array Value of " + row + " is : " + x[row][col]);
			}
				System.out.println("-----------------------");
		}

	}

}
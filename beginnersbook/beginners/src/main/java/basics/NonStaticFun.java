package basics;

public class NonStaticFun {

	public static void main(String[] args) {
		// Using new we are able to create Object
		// obj is the reference variable
		NonStaticFun obj = new NonStaticFun();
		obj.noOutput();
		int add = obj.sumOfTwo();
		System.out.println("Sum of two values : " + add);
		int div = obj.divisionMethod(30, 10);	
		System.out.println("Division of two Values : " + div);
		
		// Main method is void -- Never returns any value.
		
	}

	// No input No Output 
	// Void -- doesn't return any value
	public void noOutput() {
		System.out.println("No Input No Output.");
	}
	
	// No input return value
	public int sumOfTwo() {
		System.out.println("Addition Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;		
	}
	
	// Some input Some output
	public int divisionMethod(int x, int y) {
		System.out.println("Divison Method");
		int z = x/y;
		return z;
	}
	
}

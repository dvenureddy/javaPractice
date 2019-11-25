package oopConcepts;

public class MethodOverload {

	public static void main(String[] args) {
		MethodOverload methOverl = new MethodOverload();
		methOverl.sum();
		methOverl.sum(100);
		methOverl.sum(189, 134);
		main();
	}
	
	public static void main() {
		System.out.println("Main method overloading");
	}
	// Method overloading -- When method name is same with different arguments or input parameters with in the same class
	// You cannot create a method inside a method
	// duplicate methods -- i.e., same method name with same number of arguments are not allowed	
	public void sum() {
		System.out.println("No Input parameter.");
	}
	
	public void sum(int i) {
		System.out.println("I value is : " + i);
	}
	
	public void sum(int i, int j) {
		System.out.println("Sum of two values is : " + (i+j));
	}
	
}

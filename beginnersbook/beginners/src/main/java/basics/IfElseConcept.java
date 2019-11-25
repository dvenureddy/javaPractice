package basics;

public class IfElseConcept {

	public static void main(String[] args) {
		// Comparison Operators
		// < > <= >= == !=		
		int a = 50;
		int b = 30;
		
		if (b>a) {
			System.out.println("B is greater than A");
		}else {
			System.out.println("A is greater thann B");
		}
		
		System.out.println("-----------------------------");
		int c = 40; 
		int d = 40;
		
		if(c==d) {			
			System.out.println("C and D are equal");
		}else {
			System.out.println("C and D are not equal");
		}
		System.out.println("-----------------------------");
		// Write a logic to find the highest number 
		int x = 400;
		int y = 500;
		int z = 300;
		
		if(x>y & x>z){
			System.out.println("X is the greatest");
		}else if(y>z) {
			System.out.println("Y is the greatest");
		}else {
			System.out.println("Z is the greatest");
		}
	}
}

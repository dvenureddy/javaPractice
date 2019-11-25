package basics.conceptOfDay;

public class StackHeapMem {
	
	static void methodOne(){
		System.out.println("Method One :");
		methodTwo();
	}
	
	static void methodTwo(){
		System.out.println("Method Two : ");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started : ");
		methodOne();
		System.out.println("Main Method Ended : ");
	}

}

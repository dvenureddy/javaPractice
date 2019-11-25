package basics;

public class StackAndHeapMemory {
	
	static void methodOne() {
		System.out.println("Method One");
		methodtwo();
	}

	static void methodtwo() {
		System.out.println("Method Two");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method started");
		methodOne();
		System.out.println("Main Method Ended");
	}

}

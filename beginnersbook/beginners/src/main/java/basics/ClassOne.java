package basics;

public class ClassOne {

	public static void main(String args[]) {
		System.out.println("From Class One");
		System.out.println("----------------------");
		ClassTwo.methodOfClassTwo();
	}
}

class ClassTwo{
	static void methodOfClassTwo() {
		System.out.println("From Class Two");
	}
}

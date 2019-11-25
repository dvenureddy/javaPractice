package basics;

class ClassTen{
	public static void main(String[] args) {
		//System.out.println(" Class One Main Method");
		ClassFive.methodOfClassFive();
	}
}

public class ClassFive {
	static void methodOfClassFive() {
		System.out.println("Class Two method");
	}
}

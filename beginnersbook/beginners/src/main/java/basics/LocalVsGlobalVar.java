package basics;

public class LocalVsGlobalVar {
	
	// Global Variables -- Class Variables
	String name = "Testing";
	int age = 25;
	
	public static void main(String[] args) {
		int i = 890;
		
		System.out.println("i value in main method : " + i);
		LocalVsGlobalVar obj = new LocalVsGlobalVar();
		System.out.println("Global Variable Name value :" + obj.name);
		System.out.println("Global Variable Age value :" + obj.age);
		obj.sum();
	}
	
	public void sum() {
		int i = 230; // local var to Sum Method
		int j = 289;
		int k = i+j;
		System.out.println("Sum of two values : " + k);
	}

}

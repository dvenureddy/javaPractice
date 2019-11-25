package basics;

public class StaticAndNonStaticCon {

	String name = "Selenium Testing";  // Non static global variable
	static int age = 30;  // static global variable
	public static void main(String[] args) {
		
		//how to call static methods and variables
		// 1. direct calling;
		sum();
		// 2. calling by class name
		StaticAndNonStaticCon.sum();
		System.out.println("Age value :" + age);
		
		//how to call non static methods and variables
		StaticAndNonStaticCon obj = new StaticAndNonStaticCon();
		obj.sendMail();
		System.out.println("Non Static Name is : " + obj.name);
		
		//can i access static methods by using object reference? yes
		obj.sum(); // warning will be given
	}
	
	public void sendMail() {
		System.out.println("Send mail method");
	}
	
	public static void sum() {
		System.out.println("Static sum method");
		System.out.println("-----------");
	}

}

package basics;

public class GlobalAndLocalVariables {

	static int globalVariable = 40;
	
	public static void methodOne() {
		int localToMethod = 10;
		System.out.println("local To Method : " + localToMethod );
		System.out.println("Global Variable  : " + globalVariable);
		//System.out.println("Local to Mian : " + localToMain);
	}
	
	public static void main(String[] args) {
		
		int localToMain = 20;
		System.out.println("Local To  Mian : " + localToMain);
		System.out.println("Global variable : " + globalVariable);
		//System.out.println("Local To Method : " + localToMethod);
		System.out.println("--------------------------------------");
		methodOne();
	}
}

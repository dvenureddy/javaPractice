package basics.conceptOfDay;

public class GlobalLocalVar {
	
	static int globalVar;
	
	static void methodOne(){
		int localToMethodOne = 10;
		System.out.println("localToMethodOne : " + localToMethodOne);
		System.out.println("globalVar : " + globalVar);
		//System.out.println("localToMain : " + localToMain);
	}

	public static void main(String[] args) {
		int localToMain = 10;
		//System.out.println("localMethodOne : " + localMethodOne);
		System.out.println("globalVar : " + globalVar);
		System.out.println("localToMain : " + localToMain);
	}

}
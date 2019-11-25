package basics.conceptOfDay;

class  StaticComp{
	
	static int staticVar;
	
	static{
		System.out.println("StaticComponents SIB");
		staticVar =10;
	}
	
	static void staticMethod(){
		System.out.println("From Static Method.");
		System.out.println("Static Variable : " + staticVar);
	}
	
}

public class StaticMainClass {
	
	static 
	{
		System.out.println("MainClass SIB..");
	}
	
	public static void main(String[] args) {    
		//Static Members directly accessed with Class Name
		StaticComp.staticVar = 20;
		StaticComp.staticMethod();		
	}

}
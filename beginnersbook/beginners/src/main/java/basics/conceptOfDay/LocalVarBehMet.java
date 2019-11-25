package basics.conceptOfDay;

public class LocalVarBehMet {

	static void localMethod(){
		double d=900;
		System.out.println("Double Variable inside Local Method : " + d);
	}
	
	public static void main(String[] args) {
		double d=100;
		System.out.println("Double Variable inside Main Method : " +d);
		//localMethod();
	}

}

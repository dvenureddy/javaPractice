package basics.conceptOfDay;

public class RetrieveClass {
	String className = this.getClass().getSimpleName();
	 //String className = getClass().getName().substring(0, getClass().getName().indexOf("$"));
	public void getclassName(){
		System.out.println("Class name is : " + className);		
	}
	
	public static void main(String[] args) {

		RetrieveClass rc = new RetrieveClass();
		rc.getclassName();

	}
}
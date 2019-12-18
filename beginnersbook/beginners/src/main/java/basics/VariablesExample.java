package basics;

/**
 * @author vendolla
 *
 */
public class VariablesExample {

	  int count =1 ;
	
	public void increment() {
		count = count+1;
	}
	public static void main(String[] args) {
		
		VariablesExample obj1 = new VariablesExample();
		VariablesExample obj2 = new VariablesExample();
		System.out.println(obj1.count);
		obj1.increment();
		obj1.increment();
		System.out.println(obj1.count);
		System.out.println(obj2.count);
	}

}

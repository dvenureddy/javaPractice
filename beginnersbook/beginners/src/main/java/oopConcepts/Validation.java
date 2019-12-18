package oopConcepts;

public class Validation {

	public static void main(String[] args) {
		Derived d = new Derived();
		d.fun();
		d.sample();
		
		Base b = new Derived();
		b.fun();
		b.sample();
	}

}

package oopConcepts;

// Has-a relationship
public class BMW extends Car {

	// When method is present in child class as well as in child class with the same
	// name and same no of arguments is called Method overriding
	public void start() {
		System.out.println("BMW Slef-----start");
	}

	public void theftSafety() {
		System.out.println("BMW theft Safety");
	}
}

package oopConcepts;

public class Car extends Vehicle{

	public void start() {
		System.out.println("Car--------Start");
	}
	
	public void engine() {
		super.engine();
		System.out.println("Car--------Engine");
	}
	
	public void noWheels() {
		System.out.println("Number of Wheels : " + super.fourWheels);
	}
	
	public void stop() {
		System.out.println("Car---------Stop");
	}
	
	public void refuel() {
		System.out.println("Car--------Refuel");
	}

}

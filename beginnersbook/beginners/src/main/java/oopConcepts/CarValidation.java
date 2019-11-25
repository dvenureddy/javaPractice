package oopConcepts;

public class CarValidation {

	public static void main(String[] args) {

		// Static polymorphism -- Compile time Polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		System.out.println("Wheels : " + b.fourWheels);
		b.noWheels();

		System.out.println("-------------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("-------------------");
		// child class object can be refereed by parent class reference variable --
		// Dynamic Polymorphism--> Runtime Polymorphism
		// Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
	
		//Down Casting throws exception
		System.out.println("-------------------");
		//BMW b1 = (BMW)new Car(); //ClassCastException

	}

}

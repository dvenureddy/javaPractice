package basics;

public class Car {
	
	// Class Variables or Global Variables
	String mod;
	int wheel;	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException   {
		// new Car(); -- this is the object of Car Class
		// new keyword is used to create object
		// a, b, c -- object reference variables 
		// newInstance() method of Class object Can be created
		// clone() method -- no constructor call -- Class Object can be created		
		
		Car a = new Car();
		Car b = Car.class.newInstance();
		//Car c = (Car)b.clone();
		Car c = new Car();
		
		a.mod = "BMW-2014";
		a.wheel = 4;
		
		b.mod = "XUV-2015";
		b.wheel = 4;
		
		c.mod = "Innova-2018";
		c.wheel = 4;
		
		System.out.println("Model of the vehicle : " + a.mod);
		System.out.println("Number of wheels : " + a.wheel);
		System.out.println("-------------------------------");
		
		System.out.println("Model of the vehicle : " + b.mod);
		System.out.println("Number of wheels : " + b.wheel);
		System.out.println("-------------------------------");
		
		System.out.println("Model of the vehicle : " + c.mod);
		System.out.println("Number of wheels : " + c.wheel);
		System.out.println("-------------------------------");
	}

}

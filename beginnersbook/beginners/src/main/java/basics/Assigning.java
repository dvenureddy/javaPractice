package basics;

public class Assigning {
	
	// Class Variables or Global Variables
	String mod;
	int wheel;	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException   {
	
		Assigning a = new Assigning();
		Assigning b = new Assigning();
		Assigning c = new Assigning();
		
		a.mod = "BMW-2014";
		a.wheel = 4;
		
		b.mod = "XUV-2015";
		b.wheel = 4;
		
		c.mod = "Innova-2018";
		c.wheel = 4;
		
		System.out.println("Before assigning the Refernce");
		System.out.println("-------------------------------");
		System.out.println("Model of the vehicle : " + a.mod);
		System.out.println("Number of wheels : " + a.wheel);
		System.out.println("-------------------------------");
		
		System.out.println("Model of the vehicle : " + b.mod);
		System.out.println("Number of wheels : " + b.wheel);
		System.out.println("-------------------------------");
		
		System.out.println("Model of the vehicle : " + c.mod);
		System.out.println("Number of wheels : " + c.wheel);
		System.out.println("-------------------------------");
		
		// Reference Variable or Assigning Variable
		a=b;
		b=c;
		c=a;
		
		System.out.println("After assigning the Refernce");
		System.out.println("-------------------------------");
		
		a.mod = "Indica-2019";
		System.out.println("Model of the vehicle a.mod : " + a.mod);
		System.out.println("---------------------------------------------");
		c.mod = "Indica Vista-2019";
		System.out.println("Model of the vehicle a.mod : " + a.mod);
		System.out.println("--------------------------------------------");
		System.out.println("Model of the vehicle c.mod : " + c.mod);
		System.out.println("--------------------------------------------");
		System.out.println("Model of the vehicle b.mod : " + b.mod);
		
	}

}

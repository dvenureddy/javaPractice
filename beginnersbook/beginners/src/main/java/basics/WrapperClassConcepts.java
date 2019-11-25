package basics;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		// Data conversion from String to Integer
		int in = Integer.parseInt(x);
		System.out.println("Integer Value : " + (x+in));
		
		// String to double Conversion 
		String y = "12.33";
		System.out.println("Double Value : " + (Double.parseDouble(y)+30));
		
		//String to Char
		String S= "Hello World";
		for(int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			System.out.println("Char at : " + i + " Index is : " + c );
		}
		
		//String to boolean
		String b = "true";
		System.out.println("Boolean Value : " + Boolean.parseBoolean(b));
		
		//int to String
		int k =200;
		System.out.println("Inger Value : " + (k+890));
		System.out.println("String value : " + (String.valueOf(k)+290));
		
		String z = "100A";
		System.out.println("COmbination Value : " + Integer.parseInt(z));

	}

}

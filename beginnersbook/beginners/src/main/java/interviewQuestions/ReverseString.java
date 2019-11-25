package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		// String is immutable
		// Difference between String and String BUffer 		
		String s = "selenium";
		int len = s.length();
		System.out.println("Reverse of String is :" + s);
		System.out.println("Length of the String is : " + len);
		
		String rev = "";
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i) ;			
		}
		System.out.println("Reversed String : " + rev);
		
		System.out.println("---------");
		String S1 = "Hello World";
		StringBuffer SB = new StringBuffer(S1);
		System.out.println("" + SB.reverse());
		
	}

}

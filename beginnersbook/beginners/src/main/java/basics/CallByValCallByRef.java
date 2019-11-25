package basics;

public class CallByValCallByRef {

	int p,q;
	
	public static void main(String[] args) {
		int add;
		CallByValCallByRef cbv = new CallByValCallByRef();
		add = cbv.sum(123, 143);
		System.out.println("--------------------------------");
		System.out.println("Addition of two numbers : " + add);
		
		cbv.p = 789;
		cbv.q = 123;
		System.out.println("P Value before swap : " + cbv.p);
		System.out.println("Q Value before swap : " + cbv.q);
		System.out.println("--------------------------------");
		cbv.swap(cbv);
		System.out.println("P Value after swap : " + cbv.p);
		System.out.println("Q Value after swap : " + cbv.q);
	}

	// Call By value
	public int sum(int a, int b) {
		System.out.println("A value before : " + a);
		System.out.println("B value before : " + b);
		System.out.println("---------------------------");
		a=90;
		b=89;
		System.out.println("A value after : " + a);
		System.out.println("B value after : " + b);
		int c = a+b;
		System.out.println("Sum value in sum method " + c);
		return c;
	}
	
	// Call By Reference
	public void swap(CallByValCallByRef cbr) {
		int temp;
		temp = cbr.p;
		cbr.p = cbr.q;
		cbr.q = temp;
	}
}

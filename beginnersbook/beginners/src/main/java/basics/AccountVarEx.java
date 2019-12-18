package basics;

/**
 * this Key word
 * @author vendolla
 *
 */
public class AccountVarEx {
	
	int a,b;
	
	public void setData(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void showData() {
		System.out.println(" Value of A is : " + a);
		System.out.println(" Value of B is : " + b);
	}

	public static void main(String[] args) {
		AccountVarEx obj = new AccountVarEx();
		obj.setData(2, 3);
		obj.showData();
	}

}

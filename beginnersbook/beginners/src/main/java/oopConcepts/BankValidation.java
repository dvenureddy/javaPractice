package oopConcepts;

public class BankValidation {

	public static void main(String[] args) {

		System.out.println("Minimum Value " + US.MIN_BAL);
		System.out.println("--------------------");
		HSBCBank hsb = new HSBCBank();
		hsb.debit();
		hsb.credit();
		hsb.transferMoney();
		hsb.eductaionLoan();
		hsb.carLoan();
		System.out.println("---------------");
		
		System.out.println();
		
		//Dynamic Polymorphism
		US usb = new HSBCBank();
		usb.debit();
		usb.credit();
		usb.transferMoney();
		System.out.println("----------------");
		
		
		Brazil bb = new HSBCBank();
		bb.mutualFunnd();
		System.out.println("Minimum mutual fund " + Brazil.MIN_FUND);
	}
}